import java.util.Scanner;

public class Ifsample {
	
	public static void main(String ar[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is Positive");
		}
	}

}
