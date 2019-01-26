package com.alliance.utility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtility {

	public static boolean isStringNullOrEmpty(String str) {
		if (null == str || str.trim().isEmpty() || str.equalsIgnoreCase("null"))
			return true;
		return false;
	}

	public static boolean isStringNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static boolean isStringArrayNullOrEmpty(String[] list) {
		if (list == null || list.length == 0)
			return true;
		return false;
	}

	public static boolean isStringInteger(String str) {
		try {
			Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	public static List<String> stringArrayToList(String[] stringArray) {
		List<String> stringList = new ArrayList<String>(Arrays.asList(stringArray));
		return stringList;
	}

	public static List<Integer> stringArrayToIntegerList(String[] stringArray) {
		List<Integer> integerList = new ArrayList<Integer>();
		for (String str : stringArray)
			integerList.add(Integer.parseInt(str));
		return integerList;
	}

	public static String strToDTMF(String inStr) {
		StringBuffer x = new StringBuffer(inStr);
		String abc = "abcABC";
		String def = "defDEF";
		String ghi = "ghiGHI";
		String jkl = "jklJKL";
		String mno = "mnoMNO";
		String pqrs = "pqrsPQRS";
		String tuv = "tuvTUV";
		String wxyz = "wxyzWXYZ";
		String t = "";

		for (int a = 0; a < x.length(); a++) {
			t = x.substring(a, a + 1);
			if (abc.indexOf(t) > -1) {
				x.replace(a, a + 1, "2");
			} else if (def.indexOf(t) > -1) {
				x.replace(a, a + 1, "3");
			} else if (ghi.indexOf(t) > -1) {
				x.replace(a, a + 1, "4");
			} else if (jkl.indexOf(t) > -1) {
				x.replace(a, a + 1, "5");
			} else if (mno.indexOf(t) > -1) {
				x.replace(a, a + 1, "6");
			} else if (pqrs.indexOf(t) > -1) {
				x.replace(a, a + 1, "7");
			} else if (tuv.indexOf(t) > -1) {
				x.replace(a, a + 1, "8");
			} else if (wxyz.indexOf(t) > -1) {
				x.replace(a, a + 1, "9");
			} else {
				x.replace(a, a + 1, "$");
			}
		}

		int pnter = 0;
		while (pnter < x.length()) {
			if (x.substring(pnter, pnter + 1).compareTo("$") == 0) {
				x.deleteCharAt(pnter);
			} else {
				pnter++;
			}
		}

		return x.toString();
	}

	public static boolean stringArrayContainsDuplicateEntry(String[] stringArray) {
		List<String> tempContainer = new ArrayList<String>();
		for (String element : stringArray) {
			if (tempContainer.contains(element.trim()))
				return true;
			tempContainer.add(element);
		}
		return false;
	}

	// public static String encode(String str) {
	// return new String(Base64.encodeBase64(str.getBytes()));
	// }
	//
	// public static String decode(String str) {
	// return new String(Base64.decodeBase64(str));
	// }

	public static String replaceLast(String string, String substring, String replacement) {
		int index = string.lastIndexOf(substring);

		if (index == -1)
			return string;

		return string.substring(0, index) + replacement + string.substring(index + substring.length());
	} // IP CHECKER

	public static boolean isValidIp(String ip) {
		String IP_PATTERN = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
		Pattern pattern = Pattern.compile(IP_PATTERN);
		Matcher matcher = pattern.matcher(ip);
		return matcher.matches();
	}

	// EMAIL CHECKER
	public static boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean isValidPassword(String password) {
		String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$";
		Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();
	}

	// US PHONE CHECKER
	public static boolean isValidPhone(String phoneNumber) {
		String PHONE_PATTERN = "\\d{3}[-| ]\\d{3}[-| ]\\d{4}";
		String PHONE_PATTERN2 = "\\d{3}[-| ]\\d{7}";

		Pattern pattern = Pattern.compile(PHONE_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		if (matcher.matches() == true)
			return true;
		else {
			pattern = Pattern.compile(PHONE_PATTERN2);
			matcher = pattern.matcher(phoneNumber);
			return matcher.matches();
		}
	}

	// US PHONE CHECKER
	public static boolean isValidPhone2(String phoneNumber) {
		String PHONE_PATTERN = "^[0-9()+_\\-.]*$";

		Pattern pattern = Pattern.compile(PHONE_PATTERN);
		Matcher matcher = pattern.matcher(phoneNumber);
		return matcher.matches();
	}

}
