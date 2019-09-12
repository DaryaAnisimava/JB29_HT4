package by.epam.les05.main;

public class Task12 {
	//Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его
	//площади, если угол между сторонами длиной X и Y— прямой.
	public static void main(String[] args) {
	double x;
	double y;
	double z;
	double t;
	
	x = 4;
	y = 3;
	z = 5;
	t = 6;
	double d = Math.sqrt(x * x + y * y);
	
	double s1 = sq1(x, y);
	double s2 =sq2(z,t,d);
	double s = s1 + s2;
	System.out.println("Плошадь четырехугольника = " + s);
	}

	public static double sq2(double z, double t, double d) {
		double p = (z + t + d)/2;
		double s = Math.sqrt(p *(p-z)*(p-t)*(p-d));
		return s;
	}

	public static double sq1(double x, double y) {
		double s = 0.5 * x * y;
		return s;
	}

	
	
}
