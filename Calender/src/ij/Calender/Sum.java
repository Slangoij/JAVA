package ij.Calender;
import java.util.*;

public class Sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String val = scanner.nextLine();
		String[] intarr = val.split(" ");
		int tmpsum = Integer.parseInt(intarr[0]) + Integer.parseInt(intarr[1]);
		System.out.println("두수의 합은 " + Integer.toString(tmpsum)
		+ "입니다.");
		scanner.close();
	}
}
