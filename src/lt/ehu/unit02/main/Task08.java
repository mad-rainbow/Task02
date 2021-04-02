package lt.ehu.unit02.main;

public class Task08 {

	public static void main(String[] args) {

		double a, b, h, y;
		
		a = 1;
		b = 5.5;
		h = 0.5;
		
		System.out.println("---------------------------------");
		System.out.printf("|%8s\t|%8s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for(double x = a; x < b; x = x + h) {
			y = 2 * Math.tan(x / 2) + 1;
			System.out.printf("|%9.1f\t|%10.2f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
		}
		
	
	}
