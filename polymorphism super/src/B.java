
public class B extends A{
	
	int a;
	
	B(){
		System.out.println("ITS A B CONSTRUCTOR");
	}
	
	B(int a){
		super(10);
		System.out.println("ITS ARG OF B");
	}
	void display() {
		System.out.println("ITS B");
		
		a=20;
		
		super.a=20;
		int c=a+super.a;
		System.out.println(c);
		
	}
	void baseDisplay() {
		super.display();
	}
	
	public static void main(String[] args) {
		  B b=new B(10);
		  /*b.display();
		  b.baseDisplay();
		  */
		
	
	}
}
