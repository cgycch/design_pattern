package com.cch.singleton;

/**
 * Thread safety
 *     这种方式采用双锁机制，安全且在多线程情况下能保持高性能
 * @author Administrator
 *
 */
public class SingletonFour {

	private static SingletonFour instance;
	private static int id;

	private SingletonFour() {
	}

	public static synchronized SingletonFour getInstance() {
		if (instance == null) {
			synchronized (SingletonFour.class) {
				if (instance == null) {
					sheep();
					instance = new SingletonFour();
				}
			}
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
