package com.cch.singleton;

/**
 * Thread safety
 *     对静态域使用延迟初始化，应使用这种方式而不是双检锁方式
 *     利用了 classloader 机制来保证初始化 instance 时只有一个线程,
 * SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，才会显式装载 SingletonHolder 类，从而实例化 instance
 * @author Administrator
 *
 */
public class SingletonFive {

	private static class SingletonHolder {
		private static final SingletonFive INSTANCE = new SingletonFive();
	}

	private SingletonFive() {
	}

	public static synchronized SingletonFive getInstance() {
		return SingletonHolder.INSTANCE;
	}

	public static void showId() {
		System.out.println("instance: " + getInstance());
	}

}
