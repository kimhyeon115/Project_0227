package Package_2;

public class Ex7_4 {

	public static void main(String[] args) {
		Point3D1 p = new Point3D1(1,2,3);
		System.out.println("x=" + p.x + ", y=" + p.y + ", z=" + p.z);
	}
}

class Point1 {
	int x, y;
	
	Point1(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Point3D1 extends Point1 {
	int z;
	
	Point3D1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
}