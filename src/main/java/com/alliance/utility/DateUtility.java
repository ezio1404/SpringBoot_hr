package com.alliance.utility;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class DateUtility {
	//
	// private final static DebugManager logger = DebugManager.getInstance(DateUtility.class);
	//
	// public static boolean isValidDateFormat_MMDDYYYY(String dateString) {
	// SimpleDateFormat formatter = new SimpleDateFormat(CisteraConstants.MMDDYYYY);
	// formatter.setLenient(false);;
	// try {
	// Date date = formatter.parse(dateString);
	// DateUtils.parseDate(dateString,CisteraConstants.MMDDYYYY); //parse for valid month, year, day integer values
	// } catch (ParseException e) {
	// logger.error("Date String provided is of invalid format: " + dateString);
	// return false;
	// }
	// return true;
	// }
	// public static Long convertDateStringToMilliSeconds(String dateString, boolean isStartDate){
	// SimpleDateFormat formatter = new SimpleDateFormat(CisteraConstants.MMDDYYYY);
	// formatter.setLenient(false);
	// Date date;
	// try {
	// date = formatter.parse(dateString);
	// DateUtils.parseDate(dateString,CisteraConstants.MMDDYYYY); //parse for valid month, year, day integer values
	// } catch (ParseException e) {
	// logger.error("Date String provided is of invalid format: " + dateString);
	// return 0L;
	// }
	//
	// Calendar cal;
	// cal = Calendar.getInstance();
	// cal.setTime(date);
	// if(isStartDate){
	// cal.set(Calendar.HOUR_OF_DAY, 0);
	// cal.set(Calendar.MINUTE, 0);
	// cal.set(Calendar.SECOND, 0);
	// cal.set(Calendar.MILLISECOND, 0);
	// }else{
	// cal.set(Calendar.HOUR_OF_DAY, 23);
	// cal.set(Calendar.MINUTE, 59);
	// cal.set(Calendar.SECOND, 59);
	// cal.set(Calendar.MILLISECOND, 999);
	// }
	// String dateInMilSec = new Long(cal.getTimeInMillis()).toString();
	//
	//
	// return new Long(dateInMilSec);
	// }
	//
	// public static Long convertDateTimeStringToMilliSeconds(String dateString, String hour, String minute, boolean isStartDate){
	// SimpleDateFormat formatter = new SimpleDateFormat(CisteraConstants.MMDDYYYY);
	// formatter.setLenient(false);
	// Date date;
	// try {
	// date = formatter.parse(dateString); //parse for valid format
	// DateUtils.parseDate(dateString,CisteraConstants.MMDDYYYY); //parse for valid month, year, day integer values
	// } catch (ParseException e) {
	// logger.error("Date String provided is of invalid format: " + dateString);
	// return 0L;
	// }
	//
	// Calendar cal;
	// cal = Calendar.getInstance();
	// cal.setTime(date);
	// if(isStartDate){
	// cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hour));
	// cal.set(Calendar.MINUTE, Integer.parseInt(minute));
	// cal.set(Calendar.SECOND, 0);
	// cal.set(Calendar.MILLISECOND, 0);
	// }else{
	// cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hour));
	// cal.set(Calendar.MINUTE, Integer.parseInt(minute));
	// cal.set(Calendar.SECOND, 59);
	// cal.set(Calendar.MILLISECOND, 999);
	// }
	// String dateInMilSec = new Long(cal.getTimeInMillis()).toString();
	//
	//
	// return new Long(dateInMilSec);
	// }

	public static String convertMillisToHourFormat_HHmmss(Long milliSeconds) {
		try {
			String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(milliSeconds), TimeUnit.MILLISECONDS.toMinutes(milliSeconds) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(milliSeconds)), TimeUnit.MILLISECONDS.toSeconds(milliSeconds) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(milliSeconds)));
			return hms;
		} catch (Exception e) {
			return null;
		}
	}

	// ASI492: transferred from CommonUtility
	public static String convertTimeStampToDateString(String timeStamp, String timeFormat) {
		Date date = new Date(Long.parseLong(timeStamp));
		Format format = new SimpleDateFormat(timeFormat);
		return format.format(date).toString();
	}

	public static void main(String[] args) {
		System.out.println("1 - " + convertTimeStampToDateString("1545172180", "yyyy-MM-dd HH:mm"));
		System.out.println("2 - " + getFormattedDate(1545172180L*1000, "yyyy-MM-dd HH:mm"));
	}
	
	// ex. Mon, 17 Jun 2013 20:17:34
	public static String getFormattedDate(Long dateInMills, String format) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(dateInMills);
		SimpleDateFormat fmt = new SimpleDateFormat(format);// MM-dd-YY HH:mm:ss -> use constants!
		// fmt.setTimeZone(TimeZone.getTimeZone("EST"));
		// System.out.println("formater timezone: " + fmt.getTimeZone());
		return fmt.format(calendar.getTime());
	}

	/**
	 * Description of the Method
	 *
	 * @param y YEAR
	 * @param m MONTH
	 * @param d DAY
	 * @return exact file name
	 */
	public static String parseDate(String y, String m, String d) {
		Date dt = new Date();
		Calendar cl = new GregorianCalendar();
		cl.setTime(dt);

		int dd = cl.get(Calendar.DAY_OF_MONTH);
		int mm = cl.get(Calendar.MONTH);
		int yy = cl.get(Calendar.YEAR);

		if (((y != null) && ((y = y.trim()).length() > 0)) | ((m != null) && ((m = m.trim()).length() > 0)) | ((d != null) && ((d = d.trim()).length() > 0))) {
			try {
				yy = Integer.parseInt(y);
			} catch (Exception ee) {
				System.out.println("Exception Generated " + ee.getMessage());
			}

			try {
				mm = Integer.parseInt(m) - 1;
			} catch (Exception ee) {
				System.out.println("Exception Generated " + ee.getMessage());
			}

			try {
				dd = Integer.parseInt(d);
			} catch (Exception ee) {
				System.out.println("Exception Generated " + ee.getMessage());
			}
		}
		cl.set(Calendar.DAY_OF_MONTH, dd);
		cl.set(Calendar.MONTH, mm);
		cl.set(Calendar.YEAR, yy);

		return (cl.getTime().getTime() + (3600 * 1000 * 24)) + "";
	}
}
