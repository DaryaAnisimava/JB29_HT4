package by.epam.les05.main;

import java.util.Random;

public class Task8 {
	//Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать
	//число, которое меньше максимального элемента массива, но больше всех других элементов).
	public static void main(String[] args) {
		int n;
		int f;
		int f2;
		n = 10;
	
		int[] a = new int[n];
		
		
		init(a);
		print(a);
		
		f = fmax(a);
		System.out.println("max= " + f);
		f2 = ftwomax(a);
		
		System.out.println("2nd max= " + f2);
		
	}

	public static void init(int[] a) {
		Random rand = new Random();
		for (int i = 0; i< a.length-1; i++) {
		a[i] = rand.nextInt(10);
		}	
	}
	
	
	public static void print(int[] a) {
		for (int i = 0; i< a.length-1; i++) {
		System.out.print(a[i] + ",");
		}
	}
	
	
	
	private static int fmax(int[] a) {
	    int max = a[0];
	    
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] > max) {
	            max = a[i];
	        }
	    }
	 
	   
	return max;
		
	}
	
	
	private static int ftwomax(int[] a) {
	    int max = 0;
	    int max2 = 0;

	 for (int i = 0; i < a.length; i++) {
	     if (a[i] > max) {
	         max2 = max;
	         max = a[i];
	     } else if (a[i] > max2)
	    
	         max2 = a[i];
	     }
	 return max2;
	}
	 
	   
	
		
	
	
}
