package com.masai.assignment.day15.q2;


import java.util.Objects;

public class Song {

	private String movieName;
	private String songName;
	
	
	public Song(String movieName, String songName) {
		super();
		this.movieName = movieName;
		this.songName = songName;
	}

	public void play() {
		System.out.println(songName+" of "+movieName+" is playing...!");
	}
	
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	@Override
	public boolean equals(Object obj) {
		
		Song s1 = this;
		Song s2 = (Song)obj;
		
		return s1.getMovieName().equals(s2.getMovieName()) && s1.getSongName().equals(s2.getSongName());
	}
    
	@Override
	public int hashCode() {
		
		return Objects.hash(movieName,songName);
	}
}