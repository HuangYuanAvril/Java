package java0;

import java.util.Scanner;

public class PrimeSum {

	/*
	 * 题目内容：
		我们认为2是第一个素数，3是第二个素数，5是第三个素数，依次类推。
		现在，给定两个整数n和m，0<n<=m<=200，
		你的程序要计算第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
		
		输入格式:
		两个整数，第一个表示n，第二个表示m。
		
		输出格式：
		一个整数，表示第n个素数到第m个素数之间所有的素数的和，包括第n个素数和第m个素数。
		
		输入样例：
		2 4
		
		输出样例：
		15
	 */
	public static void main(String[] args) {
		//输入
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//判断素数
		int count = 0;	//素数计数器
		int sum = 0;
		for(int i = 2; count <= m; i++) {
			if(isPrime(i) != 0) {
				count++;
			}
			if(count >= n && count <= m) {				
				sum = sum + isPrime(i);
			}
		}
		System.out.println(sum);
		sc.close();
	}
	
	public static int isPrime(int a) {
		for(int i = 2;i < a;i++) {
			if(a % i == 0) {
				return 0;
			}
		}
		return a;	
	}

}
