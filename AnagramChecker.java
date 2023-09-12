import java.util.*;

public class AnagramChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = Integer.parseInt(input.nextLine());
		for (int testCase = 0;testCase < testCases;testCase++) {
			boolean y = true;
			String x = input.nextLine();
			for (int i = 0;i <= x.length() / 2 - 1;i++) {
				if (!(x.substring(x.length() / 2 + 1).contains(x.substring(i, i + 1))) || (x.substring(x.length() / 2 + 1).equals(x.substring(0,x.length() / 2)))) {
					y = false;
				}
			}
			if (y) {
				System.out.println(x + " = ANAGRAM");
			}
			else {
				System.out.println(x + " = NOT AN ANAGRAM");
			}
		}
	}
}
