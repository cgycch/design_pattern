package com.cch.adapter;

import com.cch.adapter.interf.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		throw new RuntimeException("not supported!");
	}

	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName); 
	}

}
