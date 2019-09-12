package by.epam.les05.main;
import java.util.Scanner;
public class Task16 {
	/*
	 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и
43). Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше
2. Для решения задачи использовать декомпозицию.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		System.out.println("Enter n");
		n = sc.nextInt();
	
		
		      
		for (int i =n; i <= 2 * n; i++) {
			
			if ((Prim(i)==1) && (Prim(i+2)) == 1) {
				//System.out.println("Числа-близнецы на отрезке" + "(" +n + "; " + 2*n +"):  ");
				System.out.println(+ i + "  " +(i+2));
			}
		}
	
	
	}	
    public static int Prim(int m)  
    { int i;
        if (m==2) return 1;
        else if (m==1) return 0;
        if ((m%2)==0) return 0;
        for(i=3; i<m/2; i+=2) if ((m%i)==0) return 0;
        return 1;
    }


}

