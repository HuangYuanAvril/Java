package java0;

import java.util.Scanner;

public class Eigenvalues {

	/*
	 * 你的程序要读入一个非负整数，整数的范围是[0,100000]，
	 * 然后按照上述算法计算出表示奇偶性的那个二进制数字，输出它对应的十进制值。
	 */
	public static void main(String[] args) {
		//输入
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int eigenvalues = 0;	//特征值 
		int plus = 1;	//存放十的倍数，用来将对应的特征值放在其对应的数位上
		int temp = 0;	//依次存放各数位上的数
		int i = 1;		//记录数位
		while(number > 0) {
			temp = number % 10;	//取得最低位
			if(temp % 2 == i % 2) {
				eigenvalues = eigenvalues + 1 * plus;
			}
			plus = plus * 2;
			number = number / 10;
			i++;
		}
		System.out.println(eigenvalues);

	}

}
