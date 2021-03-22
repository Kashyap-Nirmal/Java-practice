class FT extends Thread{
	synchronized public void run(){
			System.out.println("The thread being called is :"+super.getName());
	}
}
class P104{
	public static void main(String a[]){
	FT f1=new FT();
	FT f2=new FT();
	FT f3=new FT();
	f1.setName("First");
	f2.setName("Second");
	f3.setName("Third");
	f1.setPriority(3);
	f2.setPriority(5);
	f3.setPriority(7);
	f1.start();
	f2.start();
	f3.start();
	}
}