package by.epam.les05.main;
import java.util.Scanner;
public class Task18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n>");
		int n = sc.nextInt();
		
		Seq(n);
		
		
	
		
	}

	public static void Seq(int n) {
		for (int j = 1; j<=7; j++) {
			 if (j + n <= 10 ) {
			
			 for (int i = 1; i<= n; i++) {
			 
			 System.out.print(j + i - 1); 
			 }
			 } 
			 System.out.println(" "); 
			} 
		
	}

}
