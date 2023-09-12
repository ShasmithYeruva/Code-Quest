import java.util.Scanner;
import java.util.StringTokenizer;

public class NotSoSelfDriving {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				StringTokenizer x = new StringTokenizer(input.nextLine(),":");
				double speed = Double.parseDouble(x.nextToken());
				double distance = Double.parseDouble(x.nextToken());
				if (speed >= distance) {
					System.out.println("SWERVE");
				}
				else if ((speed * 5) >= distance) {
					System.out.println("BRAKE");
				}
				else {
					System.out.println("SAFE");
				}
			}
		}
	}
}
