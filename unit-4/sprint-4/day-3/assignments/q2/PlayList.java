package com.masai.assignment.day15.q2;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		
		int count  = 0;
		
		for(int i=0;i<songs.size();i++) {
			if(songs.get(i).equals(song)) {
				count++;
			}
		}
		if(count == 0) {
			System.out.println("Song added to the playlist successfully.");
			songs.add(song);
		}else {
			System.out.println("Song is already added in the playlist");
		}
	}
	
	
}