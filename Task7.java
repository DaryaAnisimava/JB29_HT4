package by.epam.les05.main;

import java.util.Random;

public class Task7 {
	//На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между
	//какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
	public static void main(String[] args) {
		int size =10;
		double [] coord = new double[size];
		
		Random rand = new Random();
		
		
		for (int i=0; i<coord.length; i++) {
			coord[i]= rand.nextDouble();
		}
		
		int xP1 = 0;
		int xP2 = 0;
		double max = 0;
		
		for (int i =0; i < coord.length - 1; i = i + 2) {
			xP1 = 1;
			for (int j = i +2; j< coord.length -1; j = j+ 2) {
				double currentDis;
				currentDis = dis( coord[i], coord[i + 1], coord[j], coord[j + 1]);
				
				if (max < currentDis) {
					max = currentDis;
					xP1 = i;
					xP2 = j;
				}
			}
		}
		
		System.out.println("Координаты точки с самым большим расстоянием между ними: ("+ xP1 + ";" + xP2 + ")");
		
		
		}	
		
	
	
	public static double dis(double a1, double a2, double b1, double b2) {
		double r1 = a2 - a1;
		double r2 = b2 - b1;
		double c = Math.sqrt(r1 * r1 + r2 * r2);
		return c;
	}
}
