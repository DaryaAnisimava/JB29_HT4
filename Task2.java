package by.epam.les05.main;

public class Task2 {
	//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
	//двух натуральных чисел:
	public static void main(String[] args) {
		int x = 21;
		int y = 7;
		  	int nd = nod(x, y);
		  	int nk = (x * y)/nd;
		    System.out.println("НОД=" +nd);
		    System.out.println("НОK=" +nk);
		    }
			
			

		    public static int nod(int a, int b) {
		        if (b == 0) return a;
		        int c = a % b;
		        return nod(b, c);	
	}
		    
		    
}
