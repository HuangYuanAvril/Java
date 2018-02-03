package java0;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		//初始化
		Scanner sc = new Scanner(System.in);
		//设置票价
		System.out.println("请投币：");
		int amount = sc.nextInt();
		//找零
		int change = amount - 10;
		if(change > 0) {			
			//显示面板
			System.out.println("**************");
			System.out.println("*Java城际铁路专线*");
			System.out.println("*  无指定座位票       *");
			System.out.println("*  票价：10元         *");
			System.out.println("***************");
			System.out.println("找零："+(amount-10));
		}else {
			System.out.println("金额不足！还需要" + (10-amount)+"元");
		}
	}

}
