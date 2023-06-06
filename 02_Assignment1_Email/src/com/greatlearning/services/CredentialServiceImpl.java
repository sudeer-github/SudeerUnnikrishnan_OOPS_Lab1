package com.greatlearning.services;

import com.greatlearning.model.Employee;
import java.util.Random;

public class CredentialServiceImpl implements CredentialService {

	@Override
	public String generateEmailAddress(String firstName, String lastName, String dept) {
		// TODO Auto-generated method stub
		return firstName + lastName + "@" + dept + ".gl.com";
	}

	@Override
	public String generatePassword() {
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String nums = "0123456789";
		String splchars = "!@#$%^&*()";

		String combined = caps + lower + nums + splchars;

		String mypass = ""; // p&C9
		Random random = new Random();

		for (int i = 0; i < 8; i++) {
			mypass = mypass + String.valueOf(combined.charAt(random.nextInt(combined.length())));
		}

		return mypass;
	}

	@Override
	public void displayDetails(Employee emp) {
		System.out.println("Employee First Name : " + emp.getFirstName());
		System.out.println("Employee Last Name  : " + emp.getLastName());
		System.out.println("Employee Email      : " + emp.getEmail());
		System.out.println("Employee Password   : " + emp.getPassword());

	}

	public String generateEmailAddress(Employee emp, String dept) {
		String mypass = emp.getFirstName().toLowerCase() + emp.getLastName().toLowerCase() + "@" + dept + ".gl.com";
		return mypass;
	}

}
