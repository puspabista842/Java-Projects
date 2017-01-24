package com.project.test;

import java.util.Scanner;

public class PrimeNumber {

	public static  void main ( String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the prime number to be checked:");
		int value = sc.nextInt();
		
		int flag= 0;
		if (value ==1||value==2){
			System.out.println("The number is prime:");
			
		}
			else if(value>2){
				for (int i=2; i<value/2; i++){
					if( value %i==0){
						flag+=1;
						break;
					}
				}
				if ( flag!=0){
					System.out.println("The number is not prime:");
					
					
				}else
				{
					System.out.println("The number is not valid:");
					
				}
			}
		}
	}
	
	

