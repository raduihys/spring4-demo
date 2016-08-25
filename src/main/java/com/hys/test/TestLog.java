package com.hys.test;

public class TestLog {
	private static void println(Object str) {
		System.out.println(str);
	}
	public static void printlnRootLog(Object str) {
		println("【RootLog】:"+str);
	}

	public static void printInitLog(String str) {
		println("【InitLog】:"+str);

	}

	public static void printEvtLog(String str) {
		println("【EvtLog】:"+str);

	}

	public static void printAopTest(String str) {
//		println("【AopLog】:"+str);
	}
	public static void printAsynTest(String str) {
		println("【AsynLog】:"+str);
	}
	
}
