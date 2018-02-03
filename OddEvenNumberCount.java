package java0;

import java.util.Scanner;

public class OddEvenNumberCount {

	/*
	 * 你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。
	 * 程序输出读到的数据中的奇数和偶数的个数。
	 */
	public static void main(String[] args) {
		//数据输入
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int odd = 0;	//偶数计数器
		int even = 0;	//奇数计数器
		while (temp != -1) {
			if (temp % 2 == 0) {
				odd++;
			}else {
				even++;
			}
			temp = sc.nextInt();
		}
		
		//输出
		System.out.println(even + " " + odd);
		
	}

}
