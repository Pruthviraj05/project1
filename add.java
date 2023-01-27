package calculation;
import java.util.Scanner;

public class add {
	Scanner sc=new Scanner(System.in);

	public void adddata() {

		System.out.println("Enter two Numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int add=n1+n2;
		System.out.println("Addition of two no .."+add);

	}

	public void subdata() {
		System.out.println("Enter two Numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sub=n1-n2;
		System.out.println("Addition of two no .."+sub);

	}

}
