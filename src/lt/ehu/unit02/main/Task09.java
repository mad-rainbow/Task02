package lt.ehu.unit02.main;

public class Task09 {

	public static void main(String[] args) {
		int x;
		double fx;
		
		x = 4;
		fx = 0;
		
		if(x <= -3)	{
			fx = 9;}
		if(x > 3) {
			fx = 1 / Math.pow(x, 2) + 1;}			
		
		if(fx != 0) {
		System.out.println(fx);
		}else {
			System.out.println("Bad input");
		}
		
	}

}

