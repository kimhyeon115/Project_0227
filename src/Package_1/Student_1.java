package Package_1;

public class Student_1 {
	String name;
	int total,avg;
	static int mat;
	private int kor;
	
	public Student_1() {}
	public Student_1(int kor) {
		this.kor = kor;
	}
//	public int getKor() {
//		return kor;
//	}
//
//	public void setKor(int kor) {
//		this.kor = kor;
//	}

	final double PI = 3.14;
	
	void show() {		
		int ss = (int)(PI * 5);	//강제 형변화
		double ss2 = PI * 5;
		double ss3 = 3254; 		//자동 형변화
		total = kor + mat;
		avg = total / 2;
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + mat);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);		
	}

}
