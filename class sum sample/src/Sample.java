
public class Sample {
	public static void main(String ar[]) {
		int num1=100;
		int num2=200;
		
		int num3=300;
		int num4=400;
		Sum s=new Sum();
		
		Sum s1=new Sum();
		
		s.calculateSum(num1,num2);
		s.displaySum();
		
		s1.calculateSum(num3, num4);
		s1.displaySum();
		
		s.displaySum();
	
	}

}
