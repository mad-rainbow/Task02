package lt.ehu.unit02.main;

import java.util.Scanner;
public class Task03 {

	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc;
		int a, b, c;
		double res;
		
		sc = new Scanner(System.in);
		
		System.out.print("> ");
		a = sc.nextInt();
		
		System.out.print("> ");
		b = sc.nextInt();
		
		System.out.print("> ");
		c = sc.nextInt();
		
		res = Math.pow(a, 2) - Math.pow(b-c, 2) + Math.log(Math.pow(b, 2) + 1);
		
		
		System.out.println(res);
		
	}

}
