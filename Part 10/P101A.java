class FirstThread implements Runnable{
	Thread t=new Thread(this,"FirstThread");
	FirstThread(){
		System.out.println("Child thread.");
		t.start();
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
class P101A{
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