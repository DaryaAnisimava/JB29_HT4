package by.epam.les05.main;

public class Task3 {
	//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
	public static void main(String[] args) {
		int x = 15;
		int y = 123;
		int z = 3;
		int v = 9;
		
		  	int nd1 = nod(x, y);
		  	int nd2 = nod(z, v);
		  	int nd = nod(nd1,nd2);
		  
		    System.out.println("НОД=" +nd);
	}
			

		    public static int nod(int a, int b) {
		        if (b == 0) return a;
		        int c = a % b;
		        return nod(b, c);	
	}
}
