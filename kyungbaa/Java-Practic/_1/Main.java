package _1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("손오공", "1682");
		Student st2 = new Student("저팔계", "1372");
		Student st3 = new Student("사오정", "1792");

		ArrayList<Student> list = new ArrayList<Student>();

		list.add(st1);
		list.add(st2);
		list.add(st3);

		// ArrayList만큼 다 반복할건디 stu가 리스트에 있는 놈들을 반복할때마다 가르킴 st1 st2 st3
		// 처음부터 반복할 경우 foreach 문 사용하는것이 좋다.
		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());

		}

		Scanner scan = new Scanner(System.in);
		

		

		while (true) {
			System.out.println("계속 검색하고 싶다면 y, 종료하고 싶다면 n");
			String input1 = scan.next();
			if (input1.equals("y")) {
				System.out.println("검색을 시작합니다.");
				String name = scan.next();
				
				boolean flag = false;
				
				for(Student stu: list) {
					if (stu.getName().equals(name)) {
						System.out.println("해당하는 학생의 학번은: "+stu.getNo());
						flag = true;
					} 
				}
				if (!flag) {
					System.out.println("해당하는 학생 이름이 없습니다.");
				}
				
			} else if (input1.equals("n")) {
				break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
