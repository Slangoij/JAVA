//관례
//클래스명은 대문자로 시작
//메소드명은 소문자로 시작
import java.util.Scanner;

public class GugudanMain {
	public static void main(String[] args) {
		System.out.println("몇몇단? : ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[][] sqrarr = Gugudan.sqrCalculate(num);
		Gugudan.printSqrarr(sqrarr);

		System.out.println("몇몇단? : ");
		Scanner scanner2 = new Scanner(System.in);
		String inputvalue = scanner2.nextLine();
		String[] splitVal = inputvalue.split(",");
		int m = Integer.parseInt(splitVal[0]);
		int n = Integer.parseInt(splitVal[1]);
		int[][] rectarr = Gugudan.rectCalculate(m, n);
		Gugudan.printSqrarr(rectarr);
		
//		for(int i=2;i<10;i++) {
//			int[] result = Gugudan.calculate(i);
//			Gugudan.printarr(result);
//		}
		
//		int[][] allresult = new int[9][9];
//		for (int i=0;i<9;i++) {
//			for (int j=0;j<9;j++) {
//				allresult[i][j] = (i+1)*(j+1);
//			}
//		}
//		for (int i=0;i<9;i++) {
//			for (int j=0;j<9;j++) {
//				System.out.print(allresult[i][j]);
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
//		// 4단
//		System.out.println("구구단 중 출력할 단 수는? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
//			
//		// 3단
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
//		
//		// 2단
//		for (int i=1;i<10;i++) {
//			System.out.println(1 * i);
//			System.out.println(2 * i);
//			System.out.println(3 * i);
//			System.out.println(4 * i);
//			System.out.println(5 * i);
//			System.out.println(6 * i);
//			System.out.println(7 * i);
//			System.out.println(8 * i);
//			System.out.println(9 * i);
//		}
	}

}
