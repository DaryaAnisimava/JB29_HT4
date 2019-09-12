package by.epam.les05.main;

public class Task10 {
	//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
	public static void main(String[] args) {
		
		int f;
		
		f = fact();
		
		System.out.println("Factorial =" +f);
		
		
	}
		
		public static int fact() {
		int counter=1, sum=1;

	    while (counter<=9) {
	    	if (counter % 2 != 0) {
	        sum=sum*counter;}
	        counter++;
	    	
	   }

	    return sum;
	   
	}	
}

