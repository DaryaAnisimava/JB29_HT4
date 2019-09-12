package by.epam.les05.main;
import java.util.Scanner;
public class Task13 {
	//Дано натуральное число N.Написать метод(методы) для формирования массива, элементами которого
	//являются цифры числа N.
	public static void main(String[] args) {
	
		int [] m = new int[10];
		int a;
		a = 1234;
		int num ;
		int mas;
		
		read();
		num = numbOfElements(m, a);
		sort(m,num);
		masiv(m, num);
		
		
	}

	public static void read() {
		Scanner sc = new Scanner(System.in);
		System.out.println(">");
		int a = sc.nextInt();
		
		
		
		
	}

	public static void sort(int[] m, int num) {
		int buf;
		for (int i = 1; i<= num/2; i++) {     
		    
			buf = m[num-i+1];     
			m[num-i+1] = m[i];     
			m[i] = buf;     
		  
		}
		
	}

	public static void masiv(int[] m, int l) {
		for (int i = 1; i<= l; i++) {     
		System.out.println(m[i]+ " " ); }
	
		
	}

	public static int numbOfElements(int [] m, int a) {
		int i = 0; 
		int rez =a;
		while (a > 0)  {     
	    
			i = i +1;     
			m[i] = a % 10;     
			a = a/ 10;                 
		
	
		
		}
		
		rez = i;
		return rez; 
	}
	
}


