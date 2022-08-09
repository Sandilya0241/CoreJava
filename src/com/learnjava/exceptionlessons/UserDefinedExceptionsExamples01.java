package com.learnjava.exceptionlessons;

public class UserDefinedExceptionsExamples01 {
	public static void main(String[] args) {
		try {
			int age = Integer.parseInt(args[0]);
			if (age > 60) {
				throw new TooYoungException("Please wait for some more days... You'll get a best match.");
			} else if (age < 18) {
				throw new TooOldException("Your age has already crossed marriage age... No chance of getting married.");
			} else {
				System.out.println("You will get match details to your registered E-Mail.");
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}

class TooYoungException extends RuntimeException {
	TooYoungException(String message) {
		/*
		 * To make description available to default exception handler.
		 */
		super(message);
	}
}

class TooOldException extends RuntimeException {
	TooOldException(String message) {
		/*
		 * To make description available to default exception handler.
		 */
		super(message);
	}
}
