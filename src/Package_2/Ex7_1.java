package Package_2;

public class Ex7_1 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, Word");
		stv.caption = true;
		stv.displayCaption("Hello, Word");
	}

}
