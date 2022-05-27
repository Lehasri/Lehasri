/*package com.chainsys.classtest;

import java.util.regex.Pattern;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;

public class Validators {
	public static boolean checkStringForParseInt(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			int asc = (int) data.charAt(index);
			if (asc > 47 && asc < 58)
				result = true;
			else

				throw new InvalidInputDataException("Enter integer value");

		}

		// if data is invalid throw new InvalidInputDataException ("The value in String
		// must contain only numbers")
		return result;
	}

	public static boolean CheckNumberForGreaterThanZero(int data) throws InvalidInputDataException {
		boolean result = false;
		if (data > 0) {
			result = true;
		}
		return result;
	}

	public static boolean checklengthOfString(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		if (len < 15 && len > 3)
			result = true;
		else

			throw new InvalidInputDataException("Invalid length");

		return result;
	}

	public static boolean checkStringOnly(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		for (int index = 0; index < len; index++) {
			data.toUpperCase();
			int asc = (int) data.charAt(index);
			if (asc >= 65 && asc <= 90 || asc == 32 || asc >= 96 && asc <= 122) {
				result = true;
			} else

				throw new InvalidInputDataException("Enter Alphabets only");

		}
		return result;
	}

	public static boolean checkMail(String email) throws InvalidInputDataException {
		// TODO
		boolean result = false;
		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
				+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		if (email == null)
			throw new InvalidInputDataException("enter email id ");
		else if (Pattern.compile(regexPattern).matcher(email).matches()) {
			result = true;
		} else {
			throw new InvalidInputDataException("enter valid email id ");
		}
		return result;
	}

	public static boolean CheckSalary(float data) throws InvalidInputDataException {
		boolean result = false;
		if ((data > 1000) && (data < 100000))
			throw new InvalidInputDataException("Enter value between 1000 and 100000");

		else if (data % 5 == 0)

			throw new InvalidInputDataException("Enter value in multiples of 500");

		else
			throw new InvalidInputDataException();

	}

	public static boolean CheckDate(String data) throws InvalidInputDataException {
		boolean result = false;
		int len = data.length();
		String[] data1 = data.split("/");
		int date = Integer.parseInt(data1[0]);
		int month = Integer.parseInt(data1[1]);
		int year = Integer.parseInt(data1[2]);
		for (int index = 0; index < len; index++) {
			int asc = (int) data.charAt(index);
			if ((asc > 47) || (asc < 58))
				throw new InvalidInputDataException("Enter date in correct format ");
			{
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month == 11) {
					if ((date >= 1) && (date <=31)) {
						if ((year >= 1983) && (year <= 2022)) {
							return true;
						} else {
							throw new InvalidInputDataException("Enter valid year");
						}
					} else {
						throw new InvalidInputDataException("Enter date between 1 and 31");
					}
				} else if (month == 4 || month == 6 || month == 8 || month == 10 || month == 12) {
					if ((date >= 1) && (date <= 30)) {
						if ((year >= 1983) && (year <= 2022)) {
							return true;
						} else {
							throw new InvalidInputDataException("Enter valid year");
						}
					} else {
						throw new InvalidInputDataException("Enter date between 1 and 30");
					}
				} else if (month == 2) {
					if ((date >= 1) && (date <= 29)) {
						if ((year >= 1983) && (year <= 2022)) {
							return true;
						} else {
							throw new InvalidInputDataException("Enter valid year");
						}
					} else {
						throw new InvalidInputDataException("Enter date between 1 and 30");
					}
				}
				return result;
			}

		}
		return false;
	}
}*/
