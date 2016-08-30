package com.hys.test;

public class TestLog {
	private static void println(Object str) {
		System.out.println(str);
	}
	public static void printRootLog(Object str) {
		println("【RootLog】:"+str);
	}

	public static void printInitLog(String str) {
//		println("【InitLog】:"+str);

	}

	public static void printEvtLog(String str) {
		println("【EvtLog】:"+str);

	}

	public static void printAopLog(String str) {
//		println("【AopLog】:"+str);
	}
	public static void printAsynLog(String str) {
//		println("【AsynLog】:"+str);
	}
	
}
