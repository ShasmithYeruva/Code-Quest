import java.util.ArrayList;
import java.util.Scanner;

public class AntiAsteroid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int testCases = Integer.parseInt(input.nextLine());
		ArrayList<ArrayList<Integer>> asteroids = new ArrayList<>(testCases);
		for (int testCase = 0;testCase < testCases;testCase++) {
			int x = input.nextInt();
			int y = input.nextInt();
			asteroids.get(testCase).add(x);
			asteroids.get(testCase).add(y);
		}
		for (int i = 1;i < asteroids.size();i = 1) {
			ArrayList<Integer> closest = asteroids.get(0);
			double closestd = Math.sqrt(closest.get(0) * closest.get(0) + closest.get(1) * closest.get(1));
			ArrayList<Integer> test = asteroids.get(i);
			int closestIndex = 0;
			if (Math.sqrt(test.get(0) * test.get(0) + test.get(1) + test.get(1)) < closestd) {
				closestd = Math.sqrt(Math.sqrt(test.get(0) * test.get(0) + test.get(1) + test.get(1)));
				closest = test;
				closestIndex = i;
			}
			System.out.print(closest.get(0));
			System.out.print(" " + closest.get(1));
			System.out.println();
			asteroids.remove(closestIndex);
		}
		
	}
}
