package com.masai.question4;

import java.util.ArrayList;
import java.util.List;

public class Nursery {
	
	public static void main(String[] args) {
		List<Plants> plants = new ArrayList();
		plants.add(new Plants("Cactus",500));
		plants.add(new Plants("MoneyPlant",1000));
		plants.add(new Plants("SnakePlant",700));
		plants.add(new Plants("Bonsai",4000));
		plants.add(new Plants("Bamboo",800));
		
		for(Plants p1: plants) {
			System.out.println("Plant Name:- "+ p1.name);
			System.out.println("Price:- "+ p1.price);
		}
	}
}


	class Plants{
		String name;
		int price;
		public Plants(String name , int price) {
		this.name = name;
		this.price = price;
	}
}