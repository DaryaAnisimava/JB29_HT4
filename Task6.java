package by.epam.les05.main;

public class Task6 {
	//Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
	//треугольника
	public static void main(String[] args) {
		double a = 6.33;
		
		double s = squareCount(a);
		double s6 = 6 * s;
		System.out.println("S правильного шестиугольника =" + s6);
	}

	public static double squareCount(double x) {
		double sx = Math.sqrt(3) / 4 * x * x;
		return sx;
	}
}
