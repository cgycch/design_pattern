package com.cch.singleton;

/**
 * Thread safety
 * 
 * @author Administrator
 *
 */
public class SingletonThree {

	private static SingletonThree instance = new SingletonThree();
	private static int id;

	private SingletonThree() {
	}

	public static SingletonThree getInstance() {
		if (instance == null) {
			// Will not enter the code block
			sheep();
			instance = new SingletonThree();
		} else {
			System.out.println("instance is not null");
		}
		// The above code block is unnecessary
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
