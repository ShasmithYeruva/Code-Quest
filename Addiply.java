import java.util.*;

public class Addiply {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for (int testCase = 0; testCase < testCases; testCase++) {
				int first = input.nextInt();
				int second = input.nextInt();
				System.out.println((first + second) + " " + (first * second));

			}
		}
	}
}
