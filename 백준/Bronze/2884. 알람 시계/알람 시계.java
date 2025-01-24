import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int alarmH;
		int alarmM;
		
		int time = 60 * h + m;
		if (h == 0 && m < 45) {
			alarmH = 23;
			alarmM = 60 - (45 - m);
		} else {
			int alarm = time - 45;
			alarmH = alarm / 60;
			alarmM = alarm % 60;
		}
		System.out.println(alarmH + " " + alarmM);

	}

}
