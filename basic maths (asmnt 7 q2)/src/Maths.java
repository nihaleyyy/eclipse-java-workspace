import java.util.Scanner;

public class Maths {
	public static void main(String ar[]) {
		int n,m,opt,add,sub,mul;
		float div;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st number");
		m=s.nextInt();
		System.out.println("Enter 2nd number");
		n=s.nextInt();
		while(true) {
			System.out.println("Enter 1 for add");
			System.out.println("Enter 2 for sub");
			System.out.println("Enter 3 for mul");
			System.out.println("Enter 4 for div");
			System.out.println("Enter 5 for exit");
			opt=s.nextInt();
			switch(opt) {
			case 1:
				add=m+n;
				System.out.println("Result= "+add);
				break;
			case 2:
				sub=m-n;
				System.out.println("Result= "+sub);
				break;
			case 3:
				mul=m*n;
				System.out.println("Result= "+mul);
				break;
			case 4:
				div=m/n;
				System.out.println("Result= "+div);
				break;
			case 5:
				System.exit(0);
			}
		}
	}

}
