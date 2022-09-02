
public class Static {
    int a=10;
    static int b=20;
	public static void main (String ar[]) {
		
		
		
		Static h=new Static();
		Static h1=new Static();
		System.out.println(h.a);
		h.hello();
		h.b=50;
		h1.b=100;
		
		
		
		h.a=20;
		h.b=300;
		h1.a=200;
		
		System.out.println("h.b: "+h.a);
		
		
	}
	void hello() {
		
	}
	
	static void hey() {
		
	}

}
