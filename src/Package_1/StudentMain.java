package Package_1;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student_1 mm = new Student_1();
		System.out.println("이름 입력");
		mm.name = scn.nextLine();
		System.out.println("국어 입력");	
		
		Student_1 mm2 = new Student_1(scn.nextInt());		
		System.out.println("수학 입력");
		mm.mat = scn.nextInt();
		mm.show();
	}

}
