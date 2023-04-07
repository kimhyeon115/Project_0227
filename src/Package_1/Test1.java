package Package_1;

class test {
	int radius;
	final double PI = 3.14;
	test(int r) {
		this.radius = r;
	}
	public double show() {
		return PI * radius * radius;
	}
}

public class Test1 {

	public static void main(String[] args) {
		test s1 = new test(4);
		System.out.println((int)(s1.show()));
		test s2 = new test(5);
		System.out.println((int)(s2.show()));
		test s3 = new test(6);
		System.out.println((int)(s3.show()));
	}

}
