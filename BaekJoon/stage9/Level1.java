package stage9;

import java.util.Scanner;
// 재귀함수를 이용한 팩토리얼
public class Level1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int result = factorial(n);
		System.out.print(result);
		scn.close();
	}
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}
