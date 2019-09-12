package by.epam.les05.main;

public class Task4 {
	//Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
	public static void main(String[] args) {
		int x = 21;
		int y = 7;
		int z = 49;
		  	int nd = nod(x, y);
		  	int nd1= nod(nd,z);
		  	
		  	int nk = (nd * z)/nd1;
		    
		    System.out.println("НОK=" +nk);
		    }
			
			

		    public static int nod(int a, int b) {
		        if (b == 0) return a;
		        int c = a % b;
		        return nod(b, c);	
	}
		    

}
