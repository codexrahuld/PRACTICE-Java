package com.masai.assignment.day15.q2;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		PlayList p = new PlayList();
		
		System.out.println("Enter no of song do you want to add");
		
		int n = input.nextInt();
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Enter Movie Name");
			
			String movieName = input.next();
			
			
			
			System.out.println("Enter Song Name");
			
			String songName = input.next();
			
			Song s = new Song(movieName, songName);
			
			p.addSong(s);
		}
		
		for(int i=0;i<p.songs.size();i++) {
			p.songs.get(i).play();
		}
		
	}

}