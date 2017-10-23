package com.senao.oop.bean;

/**
 * @author 014680
 *
 */
public class Schedule{

	// 此排程所處理的檔案格式
	String ext;
	
	// 此排程所處理的時間
	String time;
	
	// 此排程執行的間隔
	String interval;
	

	public String getExt(){
		return ext;
	}

	public String getTime(){
		return time;
	}

	public String getInterval(){
		return interval;
	}
	
}
