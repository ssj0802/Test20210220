package com.rj.bd;

import java.sql.Date;

public class Time {
	private static final String DateUtil = null;

		
	
		//转换日期
		String dateStr = "2021-02-20";
		Date date4 = DateUtil.parse(dateStr);
		System.out.println(date4);
		//2.1自定义日期格式转化
		String dateStr2 = "2021-02-20";
		Date date5 = DateUtil.parse(dateStr, "yyyy-MM-dd");
		System.out.println(date5);
		
		
		//每天的开始时间和结束时间
		String dateStr3 = "2021-02-19 11:11:11";
		Date date7 = DateUtil.parse(dateStr3);

		//3.1一天的开始，结果：2021-02-19 00:00:00
		Date beginOfDay = DateUtil.beginOfDay(date7);

		//3.2一天的结束，结果：2021-02-19 23:59:59
		Date endOfDay = DateUtil.endOfDay(date7);
		
		System.out.println("一天的开始:"+beginOfDay);
		System.out.println("一天的结束:"+endOfDay);
	

}
