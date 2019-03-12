package com.cch;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SynTest {

	public static void main(String[] args) throws UnknownHostException {
		 String name = InetAddress.getLocalHost().getHostName();  
         System.out.println("your pc name："+name);  
         
         String ip = InetAddress.getLocalHost().getHostAddress();         
         System.out.println("your internet adress："+ip);  
	}

	public static void method1() {
		System.out.println("admin remain method 1");
		System.out.println("admin update method 1 again");
		System.out.println("cgycch update method 1");
	}

	public static void method2() {
		System.out.println("cgycch add method 2");
		System.out.println("cgycch update method 2");
	}

}
