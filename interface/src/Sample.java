
public class Sample implements Hello{
	public void onText(String text) {
		System.out.println(text);
	}
	
	Sample(){
		TextScanner obj1=new TextScanner(this);
		obj1.scan();
	}
	public static void main(String[] args) {
		Sample obj2=new Sample();
	}

}
