package lt.ehu.unit02.main;
import java.util.Scanner;
public class Task04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y;
		
		y = 0;
		
		do {
			System.out.print("> ");
			while (!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Bad input\n> ");
		}
		x = sc.nextInt();
		y = y + x;
		if(x == 0) {
			break;
		}
		} while (true);
		
		System.out.println(y);
	}
	
}
