import java.util.Scanner;

public class Gugudan {
	public static int[] calculate(int n) {
		int[] result = new int[9];
		for (int i=0;i<result.length;i++) {
			result[i] = n * (i + 1);
		}
		return result;
	}
	
	public static void printArr(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.print(result[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public static int[][] sqrCalculate(int n) {
		int[][] result = new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}
		return result;
	}
	
	public static void printSqrarr(int[][] result) {
		for (int i=0;i<result.length;i++) {
			for (int j=0;j<result[i].length;j++) {
				System.out.print(result[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] rectCalculate(int m, int n) {
		int[][] result = new int[m][n];
		for (int i=0;i<m;i++) {
			for (int j=0;j<n;j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}
		return result;
	}
}
