import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int time = 60 * a + b + c;
		int finalT = time / 60;
		int finalM = time % 60;
		
		if (finalT > 23) {
			finalT -= 24;
			
		}
		
		System.out.println(finalT + " " + finalM);
	}

}
