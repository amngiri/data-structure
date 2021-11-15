package fibonacci;

import java.util.Scanner;

public class fibonacciSeriesByRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = sc.nextInt();
		int a=0,b=1;
		fibonacci(n,a,b);
		sc.close();
	}

	static int fibonacci(int n,int a,int b) {
		int c;
		if (n >= 1) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
			return fibonacci(n - 1,a,b);

		}
		return 0;
	}

}
