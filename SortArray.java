package jtm.activity01;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	
	public static void main(String[] args) {	
	
	
		Scanner sc = new Scanner(System.in);
		int arrSize = scNumber(sc);
		while (arrSize<20 && arrSize>40){
			System.out.print("Enter again: ");
			arrSize = sc.nextInt(); 
		}      
		sc.close();
	        
	        int[] IntArray = new int[arrSize];
			 
	        for (int i = 0; i < IntArray.length; i++) {
	            IntArray[i] = (int) (Math.random() * 90 + 10);
	        }
	      String n = Arrays.toString(IntArray);
	        System.out.println("Genereted numbers " + n);
	        
	        for (int k = 0; k < IntArray.length; k++) {
	        	int c = IntArray[k];
	        System.out.println("array[ " + k + " ] = " + c); 
	        }
	}
	private static int scNumber(Scanner sc) {
		System.out.print("Enter Size of Array: ");
		return sc.nextInt();
	}

}
