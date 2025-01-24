import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double input1 = Double.valueOf(input.nextInt());
		double input2 = Double.valueOf(input.nextInt());
		
		System.out.println(String.format("%.9f", input1 / input2));

	}

}
