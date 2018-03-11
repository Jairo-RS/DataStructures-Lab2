package ArrayList_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAssignment {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int numberOfIterations = sc.nextInt();

		ArrayList(numberOfIterations);
	}

	public static void ArrayList(int N) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {

			int chosenRequest = sc.nextInt();

			if (chosenRequest == 1) {
				int x = sc.nextInt();
				list.add(x);
			}

			else if (chosenRequest == 2) {
				int y = sc.nextInt();
				while (list.contains(y)) {
					list.remove(Integer.valueOf(y));
				}
			}

			else if (chosenRequest == 3) {
				System.out.println(list.size());
			}

		}

	}

}
