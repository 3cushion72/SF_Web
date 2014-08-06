package kr.co.pmgk.utils;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.lang3.time.DateUtils;

public class DateUtil {

	/*
	 * wrapping jakarta common DateUtil.java [Start]
	 */

	public static boolean isSameDay(Date date1, Date date2) {
		return DateUtils.isSameDay(date1, date2);
	}

	public static boolean isSameDay(Calendar cal1, Calendar cal2) {
		return DateUtils.isSameDay(cal1, cal2);
	}
	
	public static boolean isSameInstant(Date date1, Date date2) {
		return DateUtils.isSameInstant(date1, date2);
	}

	public static boolean isSameInstant(Calendar cal1, Calendar cal2) {
		return DateUtils.isSameInstant(cal1, cal2);
	}

	public static boolean isSameLocalTime(Calendar cal1, Calendar cal2) {
		return DateUtils.isSameLocalTime(cal1, cal2);
	}
	
	public static Date parseDate(String str, String[] parsePatterns) throws ParseException {
		return DateUtils.parseDate(str, parsePatterns);
	}

	public static Date parseDateStrictly(String str, String[] parsePatterns) throws ParseException {
		return DateUtils.parseDateStrictly(str, parsePatterns);
	}

	public static Date addYears(Date date, int amount) {
		return DateUtils.addYears(date, amount);
	}

	public static Date addMonths(Date date, int amount) {
		return DateUtils.addMonths(date, amount);
	}

	public static Date addWeeks(Date date, int amount) {
		return DateUtils.addWeeks(date, amount);
	}

	public static Date addDays(Date date, int amount) {
		return DateUtils.addDays(date, amount);
	}

	public static Date addHours(Date date, int amount) {
		return DateUtils.addHours(date, amount);
	}

	public static Date addMinutes(Date date, int amount) {
		return DateUtils.addMinutes(date, amount);
	}

	public static Date addSeconds(Date date, int amount) {
		return DateUtils.addSeconds(date, amount);
	}

	public static Date addMilliseconds(Date date, int amount) {
		return DateUtils.addMilliseconds(date, amount);
	}

	public static Date setYears(Date date, int amount) {
		return DateUtils.setYears(date, amount);
	}

	public static Date setMonths(Date date, int amount) {
		return DateUtils.setMonths(date, amount);
	}

	public static Date setDays(Date date, int amount) {
		return DateUtils.setDays(date, amount);
	}

	public static Date setHours(Date date, int amount) {
		return DateUtils.setHours(date, amount);
	}

	public static Date setMinutes(Date date, int amount) {
		return DateUtils.setMinutes(date, amount);
	}

	public static Date setSeconds(Date date, int amount) {
		return DateUtils.setSeconds(date, amount);
	}

	public static Date setMilliseconds(Date date, int amount) {
		return DateUtils.setMilliseconds(date, amount);
	}

	public static Calendar toCalendar(Date date) {
		return DateUtils.toCalendar(date);
	}
	
	public static Date round(Date date, int field) {
		return DateUtils.round(date, field);
	}

	public static Calendar round(Calendar date, int field) {
		return DateUtils.round(date, field);
	}

	public static Date round(Object date, int field) {
		return DateUtils.round(date, field);
	}
	
	public static Date truncate(Date date, int field) {
		return DateUtils.truncate(date, field);
	}

	public static Calendar truncate(Calendar date, int field) {
		return DateUtils.truncate(date, field);
	}

	public static Date truncate(Object date, int field) {
		return DateUtils.truncate(date, field);
	}
	
	public static Date ceiling(Date date, int field) {
		return DateUtils.ceiling(date, field);
	}

	public static Calendar ceiling(Calendar date, int field) {
		return DateUtils.ceiling(date, field);
	}

	public static Date ceiling(Object date, int field) {
		return DateUtils.ceiling(date, field);
	}
	
	public static Iterator<Calendar> iterator(Date focus, int rangeStyle) {
		return DateUtils.iterator(focus, rangeStyle);
	}
	
	public static Iterator<Calendar> iterator(Calendar focus, int rangeStyle) {
		return DateUtils.iterator(focus, rangeStyle);
	}

	public static Iterator<?> iterator(Object focus, int rangeStyle) {
		return DateUtils.iterator(focus, rangeStyle);
	}
	
	public static long getFragmentInMilliseconds(Date date, int fragment) {
		return DateUtils.getFragmentInMilliseconds(date, fragment);
	}

	public static long getFragmentInSeconds(Date date, int fragment) {
		return DateUtils.getFragmentInSeconds(date, fragment);
	}

	public static long getFragmentInMinutes(Date date, int fragment) {
		return DateUtils.getFragmentInMinutes(date, fragment);
	}

	public static long getFragmentInHours(Date date, int fragment) {
		return DateUtils.getFragmentInHours(date, fragment);
	}

	public static long getFragmentInDays(Date date, int fragment) {
		return DateUtils.getFragmentInDays(date, fragment);
	}

	public static long getFragmentInMilliseconds(Calendar calendar, int fragment) {
		return DateUtils.getFragmentInMilliseconds(calendar, fragment);
	}

	public static long getFragmentInSeconds(Calendar calendar, int fragment) {
		return DateUtils.getFragmentInSeconds(calendar, fragment);
	}

	public static long getFragmentInMinutes(Calendar calendar, int fragment) {
		return DateUtils.getFragmentInMinutes(calendar, fragment);
	}

	public static long getFragmentInHours(Calendar calendar, int fragment) {
		return DateUtils.getFragmentInHours(calendar, fragment);
	}

	public static long getFragmentInDays(Calendar calendar, int fragment) {
		return DateUtils.getFragmentInDays(calendar, fragment);
	}

	public static boolean truncatedEquals(Calendar cal1, Calendar cal2,
			int field) {
		return DateUtils.truncatedEquals(cal1, cal2, field);
	}

	public static boolean truncatedEquals(Date date1, Date date2, int field) {
		return DateUtils.truncatedEquals(date1, date2, field);
	}

	public static int truncatedCompareTo(Calendar cal1, Calendar cal2, int field) {
		return DateUtils.truncatedCompareTo(cal1, cal2, field);
	}

	public static int truncatedCompareTo(Date date1, Date date2, int field) {
		return DateUtils.truncatedCompareTo(date1, date2, field);
	}
	
	/*
	 * wrapping jakarta common DateUtil.java [End]
	 */

	/*
	 * PMG_CORE DateUtil Module [Start]
	 */
	
	
	
	/*
	 * PMG_CORE DateUtil Module [End]
	 */
	
}
