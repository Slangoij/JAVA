package ij.Calender;

import java.util.*;

public class Calender {
	public static int[] setarr(int n) {
		int[] tmparr = new int[7];
		for (int i = 0; i < 7; i++) {
			tmparr[i] = n + i;
		}
		return tmparr;
	}

	public static void printarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%2d", arr[i]);
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello, calender");

		int[] mmdays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Scanner scand = new Scanner(System.in);
		int n = scand.nextInt();
		if (0 < n && n < 13) 
			System.out.println(mmdays[n]);
		else
			System.out.println("1부터 12까지의 값만 입력하세요");
		scand.close();
		
//		String[] wkdays = new String[] {"일","월","화","수","목","금","토"};
//		for (int i = 0; i < wkdays.length; i++) {
//			System.out.print(wkdays[i] + " ");
//		}
//		System.out.println();
//
//		for (int i = 0; i < 20; i++) {
//			System.out.print("-");
//		}
//		System.out.println();
//
//		for (int i = 0; i < 4; i++) {
//			printarr(setarr(1 + i * 7));
//		}
	}

}
