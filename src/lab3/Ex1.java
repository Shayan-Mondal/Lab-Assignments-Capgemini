package lab3;

import java.util.*;

public class Ex1 {

	public static void main(String args[])

	{

		Scanner s = new Scanner(System.in);

		System.out.print("Enter numbers separated by comma(,): ");

		String input = s.next();

		StringTokenizer st = new StringTokenizer(input, ",");

		int sum = 0;

		while (st.hasMoreTokens())

		{

			int n = 0;

			n = Integer.parseInt(st.nextToken());

			System.out.println("Number is: " + n);

			sum += n;

		}

		System.out.println("Sum of the numbers is: " + sum);

		s.close();
	}

}
