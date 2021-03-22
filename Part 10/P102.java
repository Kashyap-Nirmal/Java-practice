class FT extends Thread{
	static int i=1,s1=0,cnt=1;
	FT(){
		start();
	}
	synchronized static void add(){
		for(cnt=1;cnt<26;++i,cnt++)
			s1+=i;
	}
	public void run(){
		add();
		if(i==101)
			System.out.println(s1);
	}
}
class P102{
	public static void main(String a[]){
		FT t1=new FT();
		FT t2=new FT();
		FT t3=new FT();
		FT t4=new FT();
		/*try{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		catch(InterruptedException ie){}*/
	}
}