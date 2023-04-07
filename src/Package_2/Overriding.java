package Package_2;

class point {
	int x;
	int y;
	String getLocation() {
		return "x : " + x + ", y: " + y;
	}

}
class Point3D extends point {
	int z;
	String getLocation() {
		return "x : " + x + ", y: " + y + ", z : " + z;
	}
}

public class Overriding {

	public static void main(String[] args) {
		Point3D po = new Point3D();
		po.getLocation();
		System.out.println(po.getLocation());
		point pi = new point();
		pi.getLocation();
		System.out.println(pi.getLocation());
	}

}
