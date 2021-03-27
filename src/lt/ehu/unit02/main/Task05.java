package lt.ehu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		
		int a, b, c;
		double res;
		
		a = 3;
		b = 4;
		c = 1;
		
		
		res = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + b;
		
		System.out.println(res);

	}

}
