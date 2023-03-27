package com.employeeapi.utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String empName() {
		String generatedName = RandomStringUtils.randomAlphabetic(1);
		return ("Vinoth"+generatedName);
	}
	
	public static String empSal() {
		String generateSal = RandomStringUtils.randomNumeric(5);
		return generateSal;
	}
	
	public static String empAge() {
		String generateAge = RandomStringUtils.randomNumeric(2);
		return generateAge;
	}

}
