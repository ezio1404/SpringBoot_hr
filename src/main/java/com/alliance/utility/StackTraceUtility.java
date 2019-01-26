package com.alliance.utility;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTraceUtility {
	public static String convertStackTraceToString(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		String stackTrace = "[EXCEPTION] " + sw.toString(); // stack trace as a string
		//		stackTrace = "\n" + stackTrace;
		return stackTrace;
	}
}
