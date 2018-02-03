package java0;

import java.util.Scanner;

public class DivisionAlgorithm {

	/*
	 * 使用辗转相除法求最大公约数
	 * 1、若有一个数为0，则另一个数就是这两个数的最大公约数
	 * 2、计算a%b，让a=b,b=余数
	 */
	public static void main(String[] args) {
		//输入两个数
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		//辗转相除法
		int gcd = 0;
		int temp = 0;
		if (a == 0) {
			gcd = b;
		}else if ( b == 0) {
			gcd = a;
		}else if (a != 0 && b != 0) {
			while( b != 0 ) {
				temp = a % b;
				a = b;
				b = temp;
			}
			gcd = a;
		}
		//输出
		System.out.println(gcd);
		in.close();
	}

}
