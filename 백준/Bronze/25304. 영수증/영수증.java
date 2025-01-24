import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int n = sc.nextInt();
		
		int pay = 0;
		
		for (int i = 0; i < n; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			
			pay += num * price;
		}
		
		if (total == pay) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
