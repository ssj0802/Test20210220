package com.rj.bd;

import java.util.Date;

public class Test {
	private static final Date DateUtil = null;

	public static void main(String[] args) {
		String[] c = { "1", "2", "3", "4" };
		//结果为Integer数组
		Integer[] intArray = Convert.toIntArray(b);

		long[] d = {1,2,3,4,5};
		//结果为Integer数组
		Integer[] intArray2 = Convert.toIntArray(c);
		
		//输出各自为一的位置
		System.out.println(intArray[0]);
		System.out.println(intArray2[0]);
		
		
		//日期或时间的偏移指针对某个日期增加或减少分、小时、天等等，达到日期变更的目的。
				String dateStr5 = "2021-02-19 11:11:11";
				Date date8 = DateUtil.parse(dateStr5);
	}

}