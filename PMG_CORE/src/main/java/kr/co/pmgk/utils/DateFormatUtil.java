package kr.co.pmgk.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.time.DateFormatUtils;

public class DateFormatUtil{
	
	/*
	 * wrapping jakarta common DateFormatUtil.java [Start]
	 */
	
	public static String formatUTC(long millis, String pattern){
		return DateFormatUtils.formatUTC(millis, pattern);
	}
	
	public static String formatUTC(Date date, String pattern){
		return DateFormatUtils.formatUTC(date, pattern);
	}
	
	public static String formatUTC(long millis, String pattern, Locale locale){
	    return DateFormatUtils.formatUTC(millis, pattern, locale);
	}
	
	public static String formatUTC(Date date, String pattern, Locale locale){
		return DateFormatUtils.formatUTC(date, pattern, locale);
	}
	
	public static String format(long millis, String pattern){
	    return DateFormatUtils.format(millis, pattern);
	}
	
	public static String format(Date date, String pattern){
	    return DateFormatUtils.format(date, pattern);
	}
	
	public static String format(Calendar calendar, String pattern){
	    return DateFormatUtils.format(calendar, pattern);
	}
	
	public static String format(long millis, String pattern, TimeZone timeZone){
	    return DateFormatUtils.format(millis, pattern, timeZone);
	}
	
	public static String format(Date date, String pattern, TimeZone timeZone){
	    return DateFormatUtils.format(date, pattern, timeZone);
	}
	
	public static String format(Calendar calendar, String pattern, TimeZone timeZone){
	    return DateFormatUtils.format(calendar, pattern, timeZone);
	}
	
	public static String format(long millis, String pattern, Locale locale){
	    return DateFormatUtils.format(millis, pattern, locale);
	}
	
	public static String format(Date date, String pattern, Locale locale){
	    return DateFormatUtils.format(date, pattern, locale);
	}
	
	public static String format(Calendar calendar, String pattern, Locale locale){
	    return DateFormatUtils.format(calendar, pattern, locale);
	}
	
	public static String format(long millis, String pattern, TimeZone timeZone, Locale locale){
	    return DateFormatUtils.format(millis, pattern, timeZone, locale);
	}
	
	public static String format(Date date, String pattern, TimeZone timeZone, Locale locale){
	    return DateFormatUtils.format(date, pattern, timeZone, locale);
	}
	
	public static String format(Calendar calendar, String pattern, TimeZone timeZone, Locale locale){
	    return DateFormatUtils.format(calendar, pattern, timeZone, locale);
	}
	
	/*
	 * wrapping jakarta common DateFormatUtil.java [End]
	 */
	
	/*
	 * PMG_CORE DateFormatUtil Module [Start]
	 */
	
	
	
	/*
	 * PMG_CORE DateFormatUtil Module [End]
	 */
}
