package Package_1;

import java.util.Scanner;

public class Main {
	static String name;
	static int kor, mat;
	static final double PI = 3.14;
//	public Main() {}  기본생성자
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Main mm = new Main();
		System.out.println("이름 입력");
		mm.name = scn.nextLine();
		System.out.println("국어 입력");
		mm.kor = scn.nextInt();
		System.out.println("수학 입력");
		mm.mat = scn.nextInt();
		mm.show();
	}
	static void show() {
		
		int ss = (int)(PI * 5);	//강제 형변화
		double ss2 = PI * 5;
		double ss3 = 3254; 		//자동 형변화
		int total,avg;
		total = kor + mat;
		avg = total / 2;
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);		
	}

}
