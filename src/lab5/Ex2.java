package lab5;

import java.util.Scanner;


class FullNameException extends Exception {

	public FullNameException(String str) {
		System.out.println(str);
	}
}


class LastNameException extends Exception {

	public LastNameException(String str) {
		System.out.println(str);
	}
}

public class Ex2 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur FirstName :: ");
		String fname = s.nextLine();
		System.out.print("Enter ur LastName :: ");
		String lname = s.nextLine();

		try {
			if (fname != null)

				System.out.println("Thank you for updating your name!");
			else
				throw new FullNameException("Please update your First Name");
		} catch (FullNameException a) {
			System.out.println(a);
		}
		try {
			if (lname != null)

				System.out.println("Thank you for updating your name!");
			else
				throw new LastNameException("Please update your Last Name");
		} catch (LastNameException b) {
			System.out.println(b);
		}
		s.close();
	}
}
