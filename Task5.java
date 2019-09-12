package by.epam.les05.main;

public class Task5 {
	//Написать метод(методы) для нахождения суммы большего и меньшего из трех чисел.
	public static void main(String[] args) {
	int x, y , z;
		x = -34;
		y = 69;
		z =103;
		
	
		
		int m = findMax(x, y);
		int m1 = findMax(m, z);
		
		int n = findMin(x,y);
		int n1 = findMin(n, z);
		
		System.out.println(m1);
		System.out.println(n1);
		
		
		
}
	 public static int findMax(int a, int b) {
	       
	        int max = Math.max(a, b);
	        return max;	
}
	 
	 
	 public static int findMin(int a, int b) {
	       
	        int min = Math.min(a, b);
	        return min;	
}
	    
}