package by.epam.les05.main;
import java.util.Scanner;
public class Task14 {
	//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<");
		int n1 = sc.nextInt();
		System.out.println("<");
		int n2 = sc.nextInt();
		
		numb(n1, n2);
		
	}

	public static void numb(int n1, int n2) {
	
		 while ((n1!=0)&&(n2!=0)) {
			 n1=n1 /10;
			 n2=n2 / 10;
		   if ((n1==0)&&(n2==0)) {
			   System.out.println("Количество цифр одинаково");
		   } 
		   if (n2 == 0) {
			   System.out.println("В первом числе больше цифр, чем во втором"); 
		   } 
		   if (n1 == 0) {
			   System.out.println("Во втором числе больше цифр, чем в первом");
			   }
		   }
		            
		
	
		
		}
		
		
		 
	
	}


