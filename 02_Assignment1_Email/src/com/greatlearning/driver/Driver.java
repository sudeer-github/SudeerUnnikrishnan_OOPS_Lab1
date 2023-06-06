package com.greatlearning.driver;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.services.CredentialServiceImpl;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		int option;
		String genemial = "";
		String genpass = "";
		String fname = "";
		String lname = " ";
		Employee emp = new Employee(fname, lname);
		Employee emp1 = new Employee();

		CredentialServiceImpl cs = new CredentialServiceImpl();

		System.out.println("Please enter the department from following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("Enter Option [1-4]: ");
		option = sc.nextInt();

		if (option > 0 && option < 5) {
			System.out.println("Enter first Name");
			fname = sc1.next();
			System.out.println("Enter Last Name");
			lname = sc1.next();
			emp.setFirstName(fname);
			emp.setLastName(lname);
		}

		switch (option) {
		case 1:

			genemial = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(),
					"tech");
			break;
		case 2:

			genemial = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(),
					"admin");
			break;
		case 3:

			genemial = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
			break;
		case 4:

			genemial = cs.generateEmailAddress(emp.getFirstName().toLowerCase(), emp.getLastName().toLowerCase(),
					"legal");
			break;

		default:
			System.out.println("Enter Valid Option,Please Enter [1-4]: ");
			System.exit(1);

		}
		genpass = cs.generatePassword();
		emp.setEmail(genemial);
		emp.setPassword(genpass);

		cs.displayDetails(emp);
		sc.close();
		sc1.close();
	}
}
