package com.cch.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ASyncDemo {
	static ExecutorService threadPool = Executors.newFixedThreadPool(8);
/**
 * 一般情况下，不建议使用第 1 种和第 2 种懒汉方式，建议使用第 3 种饿汉方式。
 * 只有在要明确实现 lazy loading 效果时，才会使用第 5 种登记方式。
 * 如果涉及到反序列化创建对象时，可以尝试使用第 6 种枚举方式。
 * 如果有其他特殊的需求，可以考虑使用第 4 种双检锁方式。
 * @param args
 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			threadPool.execute(new Runnable() {
				public void run() {
					//SingletonOne.showId();
					//SingletonTwo.showId();
					//SingletonThree.showId();
					//SingletonFour.showId();
					//SingletonFive.showId();
					SingletonSix.INSTANCE.showId();
				}
			});
		}

	}

}
