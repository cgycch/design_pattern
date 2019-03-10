package com.cch.singleton;
/**
 * Thread safety
 * @author Administrator
 *
 */
public enum SingletonSix {
    INSTANCE;  
    public void showId() { 
    	System.out.println("hashCode: " + INSTANCE.hashCode());
    }  
}
