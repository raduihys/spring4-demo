package com.hys.test;

public class TestLog {
	public static void println(Object str) {
		System.out.println("-------------------------------------------------------------");
		System.out.println(str);
		System.out.println("-------------------------------------------------------------\n");
	}

	public static void printInitLog(String str) {
//		println("【InitLog】:"+str);

	}

	public static void printEvtLog(String str) {
		println("【EvtLog】:"+str);

	}
	
}
