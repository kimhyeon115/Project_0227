package Package_1;

public class Hakjum {
	String name;
	int kor;
	int eng;
	int mat;
	void HakjumInfo() {
		int total;
		int avg;
		total = kor + eng + mat;
		avg = total / 3;
		int ss = avg / 10;
		char aa;
		switch(ss) {
		case 10: case 9: aa = 'A'; break;
		case 8: aa = 'B'; break;
		case 7: aa = 'C'; break;
		case 6: aa = 'D'; break;
		default : aa = 'F';
		}
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + aa);
	}
}
