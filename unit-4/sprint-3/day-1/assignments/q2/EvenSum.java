package com.masai.assignment.day8.q2;


		import java.util.Scanner;
		public class EvenSum {



			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				int m, n, i, j;   
				Scanner sc=new Scanner(System.in);   
				System.out.print("Enter The Number Of Rows: ");   

				m = sc.nextInt();   
				System.out.print("Enter The Number Of Columns: ");   

				n = sc.nextInt();   
				
				// Declaring the two-dimensional matrix   
				int array[][] = new int[m][n];   

				System.out.println("Enter The Elements Of The Array: ");   
				//loop for row  
				
				for (i = 0; i < m; i++)   
				//inner for loop for column  
				for (j = 0; j < n; j++)   
				array[i][j] = sc.nextInt();   

				System.out.println("Elements Of The Array Are: ");   
				for (i = 0; i < m; i++)   
				{   
				int sum=0;	
				for (j = 0; j < n; j++)   
				if(array[i][j]%2==0)
				{
					sum+=array[i][j];
					System.out.println(sum);
				}
				System.out.println();   
				}   
			}

		}
