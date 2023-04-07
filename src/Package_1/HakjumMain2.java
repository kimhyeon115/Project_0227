package Package_1;

import java.util.Scanner;

public class HakjumMain2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		HakjumMain2 hj = new HakjumMain2();
		System.out.println("이름?");
		hj.name = scn.nextLine();
		System.out.println("국어?");
		hj.kor = scn.nextInt();
		System.out.println("영어?");
		hj.eng = scn.nextInt();
		System.out.println("수학?");
		hj.mat = scn.nextInt();
		hj.HakjumInfo();

	}

	String name;
	int kor;
	int eng;
	int mat;
	int total;
	int avg;
	void HakjumInfo() {
		total = kor + eng + mat;
		avg = total / 3;
		char ss;
		if(avg<60) {ss = 'F';}
		else if(avg<70) {ss = 'D';}
		else if(avg<80) {ss = 'C';}
		else if(avg<90) {ss = 'B';}
		else {ss = 'A';}
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + ss);
	}
}