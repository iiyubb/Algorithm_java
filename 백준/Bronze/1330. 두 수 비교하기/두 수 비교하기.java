import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		if (input1 > input2) {
			System.out.println(">");
		} else if (input1 < input2) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}

	}

}
