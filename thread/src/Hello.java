
public class Hello {
	
	public static void main(String[] args) {
		SampleThread st=new SampleThread();
		
		Thread t=new Thread();
		t.start();
		
	
		
SampleThread st1=new SampleThread();
Thread t1=new Thread(st1);
		
		t1.start();
		
SampleThread st2=new SampleThread();
Thread t2=new Thread(st2);
		
		t2.start();

	}

}
