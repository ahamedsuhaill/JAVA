import java.util.Scanner;

public class Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, multi;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("enter first number:");
		a = sc.nextInt();

		System.out.println("enter second number:");
		b = sc.nextInt();
		sc.close();
		multi = a * b;
		System.out.println("sum of these number:" + multi);

	}

}
