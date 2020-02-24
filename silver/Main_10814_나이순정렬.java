package backjun.silver;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Student {
	int age;
	String name;
}

public class Main_10814_나이순정렬 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Student[] student = new Student[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			student[i] = new Student();
			student[i].age = Integer.parseInt(st.nextToken());
			student[i].name = st.nextToken();
		}
		Arrays.sort(student, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.age - o2.age;
			}

		});
		for (int i = 0; i < N; i++) {
			System.out.println(student[i].age + " " + student[i].name);
		}
	}

}
