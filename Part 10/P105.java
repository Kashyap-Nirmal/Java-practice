class Output{
	synchronized void output(String name){
		try{
			System.out.print("["+name);
			Thread.sleep(500);
			System.out.println("]");
		}
		catch(InterruptedException ie){
			System.out.println("Error.");
		}
	}
}
class FirstThread implements Runnable{
	Thread t1=new Thread(this);
	Output o=new Output();
	String name;
	FirstThread(String name,Output o){
		this.name=name;
		this.o=o;
		t1.start();
	}
	public void run(){
		o.output(name);
	}
}
class P105{
	public static void main(String a[]){
		Output o=new Output();
		FirstThread t=new FirstThread("Java",o);
		FirstThread t2=new FirstThread("Programming",o);
	}
}