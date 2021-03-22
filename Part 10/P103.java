class FirstThread implements Runnable{
	Thread t=new Thread(this,"FirstThread");
	FirstThread(){
		System.out.println("Child thread.");
		t.start();
	}
	public void run(){
		try{
			for(int i=0;i<5;i++)
				System.out.println(i+" ");
			Thread.sleep(1000);
		}
		catch(InterruptedException ie){
			System.out.println("Error.");
		}
	}
}
class P103{
	public static void main(String a[]){
		FirstThread t=new FirstThread();
	}
}