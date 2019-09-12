package by.epam.les05.main;

public class Task1 {
	//Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
	public static void main(String[] args) {
		double x1, x2, x3;
		double y1, y2, y3;
		double s;
		x1 = 2.5;
		x2 = 4;
		x3 = 8.21;
		y1 = 3.45;
		y2 = 6.77;
		y3 = 3.45;

		
		/*x1 = enterFromConsole("Enter x1");
		y1 = enterFromConsole("Enter y1");
		x2 = enterFromConsole("Enter x2");
		y2 = enterFromConsole("Enter y2");
		x3 = enterFromConsole("Enter x3");
		y3 = enterFromConsole("Enter y3");
		*/
	    s = squareCount(x1, x2, x3, y1, y2, y3);
	    
		System.out.println("square=" + s);
		
	}
	
	
	


		public static double squareCount(double a1, double a2, double a3, double b1, double b2, double b3) {
		double sq = 0.5 * Math.abs((a2-a1) * (b3 - b1) - (a3-a1) * (b2-b1));
		return sq;
	}






/*	private static int enterFromConsole(int x1) {
		
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println(">");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(">");
		}
		number = sc.nextInt();
		return number;
		
	}
	
	*/


}
