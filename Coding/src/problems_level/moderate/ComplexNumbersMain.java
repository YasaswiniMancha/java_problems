package problems_level.moderate;

import java.util.Scanner;

class ComplexNumbersMain {

	public static void main(String args[]) {

		// Write your code here

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a: ");

		int a = sc.nextInt();

		System.out.println("enter b: ");

		int b = sc.nextInt();

		System.out.println("enter a1: ");

		int a1 = sc.nextInt();

		System.out.println("enter b1: ");

		int b1 = sc.nextInt();

		System.out.println("enter n: ");

		int n = sc.nextInt();

		sc.close();

		ComplexNumbers c1 = new ComplexNumbers(a, b);

		ComplexNumbers c2 = new ComplexNumbers(a1, b1);

		if (n == 1) {
			System.out.println("plus: ");
		} else {
			System.out.println("mul: ");
		}

		switch (n) {

		case 1:
			c1.plus(c2);

			c1.print();

			break;

		case 2:
			c1.multiply(c2);

			c1.print();

			break;

		}

	}

}
