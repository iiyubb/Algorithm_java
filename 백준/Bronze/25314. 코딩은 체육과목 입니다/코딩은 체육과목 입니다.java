import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String result = "long ";
		
		for (int i = 0; i<(n-4); i+=4) {
			result += "long ";
		}

		System.out.println(result + "int");
	}

}
