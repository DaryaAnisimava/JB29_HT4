package by.epam.les05.main;

public class Task15 {
	//Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами
	//которого являются числа, сумма цифр которых равна К и которые не большее N.
	public static void main(String[] args) {
		int K = 10;
		int N = 100;
		int [] A = new int[N];
		
	
		
		
		selection(N, K, A);
	
	}
	public static void selection(int N, int K, int [] A) {
		int c = 0;
		
		for (int i=1; i<= N; i++) {
			int s = sum(i);
			if (s == K) {
				c = c + 1;
				A[c] = i;
			}
		}
		
		
		
	for (int i = 1; i <= c; i++ ) {
		System.out.println(A[i]);
	}
	}

	public static int sum(int n) {
		int sum = 0;
		while (n>0) {
			int v =n % 10;
			sum = sum + v;
			n = n/ 10;
			
		}
		return sum;
	}
}
