package backjun.silver;

import java.util.Scanner;

class Person {
	int weight;
	int height;
	int rank;
}

public class Main_7568_덩치 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Person[] person = new Person[N];
		for (int i = 0; i < N; i++) {
			person[i] = new Person();
			person[i].weight = sc.nextInt();
			person[i].height = sc.nextInt();
			person[i].rank = 1;
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (person[i].weight > person[j].weight && person[i].height > person[j].height) {
					person[j].rank++;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(person[i].rank + " ");
		}
	}

}
