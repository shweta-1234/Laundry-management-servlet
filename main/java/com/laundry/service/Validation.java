package com.laundry.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	public static boolean checkname(String name) {
		String syntax = "^[A-Za-z]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(name);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public static boolean checkitem(String item) {
		String syntax = "^[A-Za-z]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(item);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public static boolean checkquantity(int quantity) {
		String str = ""+quantity;
		String syntax = "^[0-9]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(str);

		if (m.matches()) {
			return true;
		}
		return false;
	}

	public static boolean checkcategory(String category) {
		String syntax = "^[A-Za-z]+$";
		Pattern p = Pattern.compile(syntax);
		Matcher m = p.matcher(category);

		if (m.matches()) {
			return true;
		}
		return false;
	}

}