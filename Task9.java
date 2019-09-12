package by.epam.les05.main;
import java.util.Scanner;
public class Task9 {
	//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		System.out.print(">");
		a = sc.nextInt();
		System.out.print(">");
		b = sc.nextInt();
		System.out.print(">");
		c = sc.nextInt();
		
		int p = nod(a, b);
		int r = nod(p, c);
		 //System.out.println("НОД=" + p);
		  //System.out.println("НОД=" + r);
		if ((p==1)&&(r==1)) {
			System.out.println("Числа взаимно простые");
		}else {
			System.out.println("Числа не взаимно простые");
		}
		
		 
    }
    
	

	public static int nod(int a, int b) {
        if (b == 0) return a;
        int c = a % b;
        return nod(b, c);	
}
}
