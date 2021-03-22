package lab3;

import java.net.*;
import java.io.*;
import java.util.*;

public class chatClass {

    //Exit string 
    private static final String TERMINATE = "Exit";
    //Name of the user
    static String name;
    //Exit status
    static volatile boolean finished = false;
    //Vector Clock of particular user. i.e. Sender.
    public static Dictionary<String, Integer> clock = new Hashtable<String, Integer>();
    //Count of messages send.
    public static int count = 0;

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Two arguments required: <multicast-host> <port-number>");
        } else {
            try {
                //Multicast group IP
                InetAddress group = InetAddress.getByName(args[0]);
                //Multicast group port
                int port = Integer.parseInt(args[1]);
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your name: ");
                name = sc.nextLine();
                MulticastSocket socket = new MulticastSocket(port);
                socket.setTimeToLive(0);
                socket.joinGroup(group);
                String message;
                Thread t = new Thread(new ReadThread(name, socket, group, port));
                t.start();
                System.out.println("Start typing messages...\n");
                while (true) {
                    message = sc.nextLine();
                    count++;
                    clock.put(name, count);
                    if (message.equalsIgnoreCase(chatClass.TERMINATE)) {
                        finished = true;
                        socket.leaveGroup(group);
                        socket.close();
                        break;
                    }
                    message = name + ": " + message;
                    ByteArrayOutputStream output = new ByteArrayOutputStream();
                    byte[] buffer = message.getBytes();
                    output.write(buffer);
                    output.write(" ".getBytes());
                    output.write(clock.toString().getBytes());
                    byte[] out = output.toByteArray();
                    /*
                        Actual message is converted to bytes.
                        Space is added to seperate out the actual message and 
                        the vector clock of the sender.
                        All these are converted to bytes.
                     */
                    DatagramPacket datagram = new DatagramPacket(out, out.length, group, port);
                    socket.send(datagram);
                }
            } catch (SocketException se) {
                System.out.println("Error creating socket");
            } catch (IOException ie) {
                System.out.println("Error reading/writing from/to socket");
            }
        }
    }
}

class ReadThread implements Runnable {

    //Multicast socket
    private final MulticastSocket socket;
    //Multicast group IP.
    private final InetAddress group;
    //Multicast group port.
    private final int port;
    private static final int MAX_LEN = 1000;
    //Common Vector clock.
    public static HashMap<String, Integer> clock1 = new HashMap<String, Integer>();
    //Name of the user.
    String name, message, tempString;
    String[] arrString, temp;
    //Rank of the user.
    int rank = 0;
    //Wait list for storing the messages.
    List<String> list = new ArrayList<String>();
    //Count variable for count of messages
    static int count1 = 0;

    ReadThread(String name, MulticastSocket socket, InetAddress group, int port) {
        this.name = name;
        this.socket = socket;
        this.group = group;
        this.port = port;
        clock1.put(name, count1);
    }

    public void printMessages() {
        arrString = message.split(" ");
        for (int i = 0; i < arrString.length - 1; i++) {
            System.out.print(arrString[i] + " ");
        }
        System.out.println("");
        tempString = arrString[arrString.length - 1];
        temp = tempString.split("=");
        clock1.put(temp[0].substring(1, temp[0].length()), Integer.parseInt(temp[1].substring(0, temp[1].length() - 1)));
        System.out.println("\tCurrent Vector clock is : " + clock1);
    }

    @Override
    public void run() {
        //Adding the user's name to the vector clock. With initial value 0.        
        while (!chatClass.finished) {
            byte[] buffer = new byte[ReadThread.MAX_LEN];
            DatagramPacket datagram = new DatagramPacket(buffer, buffer.length, group, port);
            try {
                socket.receive(datagram);
                message = new String(buffer, 0, datagram.getLength(), "UTF-8");
                /*
                    Here statically user with the rank 2 is delayed.
                    To create the manual delay.
                 */
                if (rank == 2) {
                    list.add(message);
                    Thread.currentThread().sleep(5000); // sleep 5 sec.                       
                }
                if (rank == 2 && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); i++) {
                        message = list.get(i);
                        printMessages();
                        list.remove(0);
                        i--;
                    }
                } else {
                    printMessages();
                }
            } catch (IOException e) {
                System.out.println("Socket closed!");
            } catch (Exception e) {
                System.out.println("Execption : " + e);
            }
            if (rank == 0) {
                int count = 0;
                for (String i : clock1.keySet()) {
                    count++;
                    if (name == i) {
                        rank = count;
                    }
                }
            }
        }
        System.out.println("\tCurrent Vector clock is : " + clock1);
    }
}
