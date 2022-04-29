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

		String[] wkdays = new String[] { "일", "월", "화", "수", "목", "금", "토" };
		for (int i = 0; i < wkdays.length; i++) {
			System.out.print(wkdays[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < 20; i++) {
			System.out.print("-");
		}
		System.out.println();

		for (int i = 0; i < 4; i++) {
			printarr(setarr(1 + i * 7));
		}
	}

}
