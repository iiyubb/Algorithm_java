import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		System.out.println(input1 * (input2 % 10));
		System.out.println(input1 * ((input2 / 10) % 10));
		System.out.println(input1 * (input2 / 100));
		System.out.println(input1 * input2);

	}

}
