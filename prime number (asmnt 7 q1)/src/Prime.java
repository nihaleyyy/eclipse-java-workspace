import java.util.Scanner;

public class Prime {
	 public static void main(String ar[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number: ");
		 int num=sc.nextInt();
		 boolean flag=false;
		 for(int i=2;i<=num;i++) {
			 if(num%i==0) {
				 flag=true;
				 break;
			 }
		 }
		 if(!flag) {
			 System.out.println(num + " is a prime number");
		 }else {
			 System.out.println(num + " is not a prime number");
		 }
	 }

}
