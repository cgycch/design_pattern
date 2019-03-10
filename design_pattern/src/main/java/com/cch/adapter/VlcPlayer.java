package com.cch.adapter;

import com.cch.adapter.interf.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: " + fileName);
	}

	public void playMp4(String fileName) {
		throw new RuntimeException("not supported!");
	}

}
