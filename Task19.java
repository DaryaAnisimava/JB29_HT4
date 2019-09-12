package by.epam.les05.main;

import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		  System.out.println("n>");
		  int n = sc.nextInt();
		  
		  int sum1 = Sum1(n);
		  int sum2 = Sum2(sum1);
		   
		   
		  System.out.println("Сумма чисел с нечетными цифрами :");
		  System.out.println(sum1);
		   
		   
		  
		  System.out.println("Количество  четных цифр в сумме:");
		  System.out.println(sum2);
		    
	}

	public static int Sum2(int sum1) {
		int f1 = sum1;
		 int sum2 = 0;
		  while (f1 != 0) { 
		  
		    if ((f1 % 10) % 2 ==0 ) {
		      sum2 = sum2 + 1;
		      }
		    f1 = f1 / 10;
		  
		    
	}
		
		return sum2;
	}

	public static int Sum1(int n) {
		int stepen = 1;
		int  sum = 0;
		  for (int a = 1; a<= n; a++) {
		  
		    stepen = stepen * 10;
		  }
		  
		 int stepen1 = 1;
		   
		  for (int a = 1; a<=n - 1; a++) {
		 
		    stepen1 = stepen1 * 10;
		  }
		  
		  int sum1 = 0;
		   
		  for (int x = stepen1; x <= stepen - 1; x++) {
	
		    sum = 0;
		    int f = x;
		    while (f != 0 ) {
		    
		      if ((f % 10) % 2 == 0) {
		        sum = sum + x;
		        }
		      f = f / 10;
		  }
		     
		    if (sum == 0) { 
		   
		      sum1= sum1 + x;
		    }
		     
		  }
		return sum1;
	}
	
	   
			
}
