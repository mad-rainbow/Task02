package lt.ehu.unit02.main;
import java.util.Scanner;
public class Task04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int x, y;
		
		y = 0;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("> ");
			while (!sc.hasNextInt()) {
				System.out.println("Bad input");
				System.out.print("> ");
				sc.nextLine();
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
