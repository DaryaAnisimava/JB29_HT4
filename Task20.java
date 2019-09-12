package by.epam.les05.main;
import java.util.Scanner;
public class Task20 {
//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
	public static void main(String[] args) {
		int x,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("n>");
		int n = sc.nextInt();
		int sum = Sum(n);
		
	
		
		  x= n;  
		  k= 0;   
		  while (x>0) {
		    
		      x=x-Sum(x);
		      k = k +1;
		  }
		  System.out.println("k="+ k);
	
	}

public static int Sum(int n) {

  int s= 0;
  int sum =0;
  while (n>0) {
  
      s= s+n % 10;
      n= n / 10;  
  }
  sum = s; 
  
	return sum;
}
}
