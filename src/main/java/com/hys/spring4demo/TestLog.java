package com.hys.spring4demo;

public class TestLog {
	private static boolean rootLogOn;
	private static boolean initLogOn;
	private static boolean evtLogOn;
	private static boolean aopLogOn;
	private static boolean asynLogOn;
	
	public static void setRootLogOn() {
		TestLog.rootLogOn = true;
	}
	public static void setInitLogOn() {
		TestLog.initLogOn = true;
	}
	public static void setEvtLogOn() {
		TestLog.evtLogOn = true;
	}
	public static void setAopLogOn() {
		TestLog.aopLogOn = true;
	}
	public static void setAsynLogOn() {
		TestLog.asynLogOn = true;
	}
	private static void println(Object str) {
		System.out.println(str);
	}
	public static void printRootLog(Object str) {
		if(rootLogOn){
			println("【RootLog】:"+str);
		}
	}

	public static void printInitLog(String str) {
		if(initLogOn){
			println("【InitLog】:"+str);
		}

	}

	public static void printEvtLog(String str) {
		if(evtLogOn){
			println("【EvtLog】:"+str);
		}

	}

	public static void printAopLog(String str) {
		if(aopLogOn){
			println("【AopLog】:"+str);
		}
	}
	public static void printAsynLog(String str) {
		if(asynLogOn){
			println("【AsynLog】:"+str);
		}
	}
	
}
