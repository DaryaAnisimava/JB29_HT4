package by.epam.les05.main;
import java.util.Scanner;
public class Task17 {
	//Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
	//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
	//использовать декомпозицию.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter k >");
		
		int k = sc.nextInt();
	
	
		for (int i = 1; i <=k; i++) {
			if (Armstr(i)==true) {
				System.out.println("i=" + i);
			}
			
		}
	}
	public static boolean Armstr(int i) {
		int r,s,t,a,j;
		 boolean arm = false;
		 s=i % 10;
		  t=1;
		  a=1;
		  r= i /10;
		  while (r>0) {
			s=s+ r % 10;
		    r= r / 10;
		    a = a +1; 
		  }
		  for (j=1; j<= a; j++)  {
			    t=t*s;
			 
			if (t == i) { 
			    arm=true;
			  }else {
			  
			  arm= false;}
			  }
		  
		   
		 
		  
		return arm; 
		

	}
	
}