package java0;

import java.util.Scanner;

public class GetMax {

	/*
	 *判断键盘录入的三个数中的最大值
	 */
	public static void main(String[] args) {
		//键盘录入三个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入三个数字：");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//选出三者中的最大值
		int temp = 0;
		int max = 0;
		if (a > b) {
			temp = a;
			if(temp > c) {
				max = temp;
			}else {
				max = c;
			}
		}else if (a < b) {
			temp = b;
			if(temp > b) {
				max = temp;
			}else {
				max = b;
			}
		}else {
			System.out.println("ERROR");
		}
		//输出最大值
		System.out.println(max);
	}

}
