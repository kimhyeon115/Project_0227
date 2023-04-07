package Package_1;

import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {
		int [][] ss = new int[][]{{11,22},{33,44},{55,66}};
		for(int i=0; i<ss.length; i++) {
			for(int j=0; j<ss[i].length; j++) {
				System.out.print(ss[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(ss));
	}

}
