package by.epam.les05.main;

import java.util.Random;

public class Task11 {
	//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
	//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
	//элементов массива с номерами от k до m.
	public static void main(String[] args) {
		int size = 6;
		int s;
		int [] d = {5, 9, 8, 7, 4, 3};
		int k=3;
		int m=5;
		
		for (int i=0; i<d.length; i++) {
			System.out.print(d[i] + ",");
			}
		
		//Random rand = new Random();
		
		
		//for (int i=0; i<d.length; i++) {
			//d[i]= rand.nextInt();
		
		
		//init(d);
		//print(d);
		s = summ(d, k, m);
		System.out.println(" sum=" + s + " for " + k + " till " + m + " elements");
		
	}

	public static void init(int[] a) {
		Random rand = new Random();
		for (int i = 0; i< a.length; i++) {
		a[i] = rand.nextInt(10);
		}	
	}
	
	
	public static void print(int[] a) {
		for (int i = 0; i< a.length; i++) {
		System.out.print(a[i] + ",");
		}
	}
	
	
	public static int summ(int[] d, int k, int m) {
		int sum = 0;
		//int k;
		//int m;
		
		for(int i = k; i<= m; ++i) {
	        sum = sum +d[i];
	    }
		return sum;
		
		
	}
	
}
