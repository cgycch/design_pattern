package com.cch.singleton;
/**
 * Non-thread security
 * @author Administrator
 *
 */
public class SingletonOne {
	
	private static SingletonOne instance;
	private static int id;

	private SingletonOne() {
	}

	public static SingletonOne getInstance() {
		if (instance == null) {
			sheep();
			instance = new SingletonOne();
		}else {
			System.out.println("instance is not null");
		}
		return instance;
	}
	
	public static void showId() {
		System.out.println("instance: " + getInstance());
	}
	
	private static void sheep() {
		try {
			// Simulated time-consuming operation
			System.out.println("instance is null and Id: " + id++);
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
