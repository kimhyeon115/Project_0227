package Package_1;

import java.util.Scanner;

public class HakjumMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Hakjum hj = new Hakjum();
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

}
