import java.util.Scanner;

public class Forloopsample {
	public static void main(String a[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=0;i<=num;i++) {
			sum=sum+i;
			
		}
		
		System.out.println("Result: "+sum);
	}

}
