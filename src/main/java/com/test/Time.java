package com.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 时间转换成时间戳
 */
public class Time {
		
	
	public static void main(String[] args) {
	/*	
		String t = "2018年11月01日00时00分00秒 到 2018年12月01日00时00分00秒";
		
		String a =t.replace(" ", "");
		String[] split = a.split("到");
		
		System.out.println(split[0]+"\n"+split[1]); //打印拆分的两个时间
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		
		Date date,data2;
		try {
			
			
			date = simple.parse(split[0]);  //	Thu Nov 01 00:00:00 CST 2018
			data2 = simple.parse(split[1]);
			System.out.println("parse 1="+date);
			
			long l = date.getTime();        //1541001600000
			long m = data2.getTime();
			System.out.println("getTime 2="+l);
			
			String sl = String.valueOf(l);	//1541001600000
			String sm = String.valueOf(m);
			System.out.println("valueof 3="+sl);
			
			
			String string = sl.substring(0,10);		//1541001600
			String string2 = sm.substring(0, 10);
			System.out.println("substring 4="+ string);
			
			
			
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		Date date = new Date();
		long time = date.getTime();
		
		SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
		System.out.println("现在的时间是= " + simple.format(new Date(time)));
		long z =   time - 604800000l;
		System.out.println("减去的时间是= " + simple.format(new Date(z)));
		
		long y = time - 2592000000l;
		System.out.println("减去的时间是= " + simple.format(new Date(y)));
		
	}
	
	
}
