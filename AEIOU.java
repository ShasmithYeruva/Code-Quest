import java.util.Scanner;

public class AEIOU {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			int testCases = Integer.parseInt(input.nextLine());
			for(int testcase = 0; testcase < testCases; testcase++) {
				String sentence = input.nextLine();
				int count = 0;
				for (int i = 0; i < sentence.length(); i++) {
					if (sentence.charAt(i) == ('a') || sentence.charAt(i) == ('e')  || sentence.charAt(i) == ('i') || sentence.charAt(i) == ('o') || sentence.charAt(i) == ('u')) {
						count++;
					}
				}
				System.out.println(count);
			}
		}
	}
}
