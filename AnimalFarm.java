import java.util.*;

public class AnimalFarm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = Integer.parseInt(input.nextLine());
		for (int testCase = 0;testCase < testCases;testCase++) {
			int two = input.nextInt();
			int four = input.nextInt() + input.nextInt();
			System.out.println(two * 2 + four * 4);
		}
	}

}
