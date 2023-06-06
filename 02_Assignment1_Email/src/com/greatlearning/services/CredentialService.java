package com.greatlearning.services;

import com.greatlearning.model.Employee;

public interface CredentialService {
	String generateEmailAddress(String firstName, String lastName, String dept);

	String generatePassword();

	void displayDetails(Employee emp);
}
