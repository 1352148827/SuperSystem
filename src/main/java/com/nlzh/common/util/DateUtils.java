package com.nlzh.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 * @author 13521
 *
 */
public class DateUtils {
	
	/**
	 * 获取当前日期的字符串 格式：yyyy-MM-dd hh:mm:ss
	 * @return
	 */
	public static String getCurrentDateStr(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String createdate = sdf.format(new Date());
		return createdate;

	}
	
	/**
	 * 获取当前日期的字符串 格式(指定格式的)
	 * @param format 指定格式，如yyyy-MM-dd hh:mm:ss
	 * @return
	 */
	public static String getCurrentDateStr(String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String createdate = sdf.format(new Date());
		return createdate;

	}
	
	/**
	 * 把yyyy-MM-dd HH:mm:ss格式字符串转为date对象(如果转换失败返回null)
	 * @param dateStr
	 * @return date对象（如果失败返回null）
	 */
	public static Date parseStrToDate(String dateStr){
		try {
			SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date = s1.parse(dateStr);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 把日期类转为指定格式的字符串(如果转换失败返回null)
	 * @param date 日期类
	 * @param formate 指定格式（"yyyy-MM-dd HH:mm:ss"）
	 * @return 指定格式的字符串
	 */
	public static String formatDateToStr(Date date, String formate){
		try {
			SimpleDateFormat s1 = new SimpleDateFormat(formate);
			String dateStr = s1.format(date);
			return dateStr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	/**
	 * 获取两个时间的间隔秒
	 * @param d1
	 * @param d2
	 * @return
	 */
	public static long secondsBetween(Date d1, Date d2) {
		return Math.abs((d1.getTime() - d2.getTime()) / 1000);
	}
	
	/**
	 * 获取某天零点时间的日期格式的字符串
	 * @param date
	 * @return
	 */
	public static String getStartTimeOfDay(String date){
		Date parseDate = parseStrToDate(date);
		Calendar day = Calendar.getInstance();
		day.setTime(parseDate);
		day.set(Calendar.HOUR_OF_DAY,0);
		day.set(Calendar.MINUTE,0);
		day.set(Calendar.SECOND,0);
		day.set(Calendar.MILLISECOND,0);
		
		Date dd = day.getTime();
		return formatDateToStr(dd,"yyyy-MM-dd HH:mm:ss");
		
	}
	
	/**
	 * 获取某天末点时间的日期格式的字符串
	 * @param date
	 * @return
	 */
	public static String getEndTimeOfDay(String date){
		
		Date parseDate = parseStrToDate(date);
		Calendar day = Calendar.getInstance();
		day.setTime(parseDate);
		day.set(Calendar.HOUR_OF_DAY,23);
		day.set(Calendar.MINUTE,59);
		day.set(Calendar.SECOND,59);
		day.set(Calendar.MILLISECOND,999);
		
		Date dd = day.getTime();
		return formatDateToStr(dd,"yyyy-MM-dd HH:mm:ss");
	}
}
