package com.cch.singleton;
/**
 * Thread safety
 * @author Administrator
 *
 */
public class SingletonTwo {

	private static SingletonTwo instance;
	private static int id;

	private SingletonTwo() {
	}

	public static synchronized SingletonTwo getInstance() {
		if (instance == null) {
			sheep();
			instance = new SingletonTwo();
		} else {
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
