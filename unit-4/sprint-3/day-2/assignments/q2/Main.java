package com.masai.assignment.day9.q2;


public class Main {

	public static void main(String[] args){
		//create an array of Animal class with size 3
		Animal [] arrAnimal = new Animal[3];

		arrAnimal[0]= new Dog();
		arrAnimal[1]=new Cat();
		arrAnimal[2]=new Tiger();

		for(int i=0;i<arrAnimal.length;i++) {
			arrAnimal[i].eat();
			arrAnimal[i].walk();
			arrAnimal[i].makeNoise();
			System.out.println("----------------");
		}


		//initialise all 3 elements of this Animal class with
		//Dog, Cat and Tiger class object.
		//call the all methods (eat,walk,makeNoise) from all
		//the 3 objects.
		}


}
