class FirstThread extends Thread{
	FirstThread(){
		System.out.println("Child thread.");
		start();
	}
	public void run(){
		try{
			System.out.println("Hello World");
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			System.out.println("Error.");
		}
	}
}
class P101B{
	public static void main(String a[]){
		FirstThread t=new FirstThread();
		try{
			System.out.println("Inside main thread.");
			System.out.println("Hello World1");
			Thread.sleep(1200);
		}
		catch(InterruptedException ie){
			System.out.println("Error.");
		}
	}
}