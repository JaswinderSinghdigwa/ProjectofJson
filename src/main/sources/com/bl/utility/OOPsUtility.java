
package com.bl.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class OOPsUtility {
	static Scanner scanner = new Scanner(System.in);

	public static int integerScanner() {
		return scanner.nextInt();
	}

	public static String stringScanner() {
		return scanner.next();
	}
	
	public static long longScanner() {
		return scanner.nextLong();
	}
	
	public static String stringSingleWordScanner() {
		return scanner.next();
	}

	public static char charScanner() {
		return scanner.next().charAt(0);
	}

	public static String[] shuffleCardsDeck(String[] arr) {
		Random random = new Random();
		int f1, f2;
		String temp;
		for (int i = 0; i < 52; i++) {
			f1 = random.nextInt(51);
			f2 = random.nextInt(51);
			if (f1 != f2) {
				temp = arr[f1];
				arr[f1] = arr[f2];
				arr[f2] = temp;
			}
		}
		return arr;

	}

	
	public static int calculateTotalValueOfStock(int numberOfShares, int sharePrice) {
		return numberOfShares * sharePrice;
	}

	
	public static String message(String fullname, String mobile, String str) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String strInput = str;
		String str1 = strInput.replaceAll("<<name>>", firstName);
		String str2 = str1.replaceAll("<<fullname>>", fullname);
		String str3 = str2.replaceAll("xxxxxxxxxx", mobile);
		String str4 = str3.replaceAll("Date", dateFormat.format(date));

		return str4;

	}

}