package com.masai.assignment.day4.q3;

public class Main {

	
	public void checkChar(char ch) {
		
		if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') { 
	
			System.out.println("Charachter is vowel!");
	
	}
	
	else if(ch == 'b' || ch == 'B' || ch == 'c' || ch == 'C' || ch == 'd' || ch == 'D' || ch == 'f' || ch == 'F' || ch == 'g' || 
			ch == 'G' || ch == 'h' || ch == 'H' || ch == 'j' || ch == 'J' || ch == 'k' || ch == 'K' || ch == 'l' || ch == 'L' ||
			ch == 'm' || ch == 'M' || ch == 'n' || ch == 'N' || ch == 'p' || ch == 'P' || ch == 'q' || ch == 'Q' || ch == 'r' ||
			ch == 'R' || ch == 's' || ch == 'S' || ch == 't' || ch == 'T' || ch == 'v' || ch == 'V' || ch == 'w' || ch == 'W' ||
			ch == 'x' || ch == 'X' || ch == 'y' || ch == 'Y' || ch == 'z' || ch == 'Z')
	{
		 System.out.println("Charachter is Consonant");
			
	}
	else {
		System.out.println("Invalid Charachter");
	}
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main M1 = new Main();
		M1.checkChar('A');
		M1.checkChar('s');
		M1.checkChar('&');
	}

}
