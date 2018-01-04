//猜数字小游戏（数据在1-100之间）
import java.util.Scanner;

class WhatIsTheNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random() * 100);
		System.out.println("----------------------------猜数字小游戏：---------------------------");
		System.out.println("系统将在每轮确定一个1-100之间的数字，试一试你能在几次猜中这个数字吧！");
		System.out.println("请选择实现的循环方法；1、for;	2、do while;	3、while;");
		int i = sc.nextInt();
		switch (i) {
			case 1:
				System.out.println("---------------以下为用for循环实现------------------");
				System.out.println("我已经想好了正确数字！请开始猜测正确答案吧！");
				methodFor(number);
				break;
			case 2:
				System.out.println("---------------以下为用do while循环实现------------------");
				System.out.println("我已经想好了正确数字！请开始猜测正确答案吧！");
				methodDoWhile(number);
				break;
			case 3:
				System.out.println("---------------以下为用while循环实现------------------");
				System.out.println("我已经想好了正确数字！请开始猜测正确答案吧！");
				methodWhile(number);
				break;
			default:
				System.out.println("ERROR!");
				break;
		}	
	}

	public static void methodDoWhile(int number){
		//do while实现
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 1;
		//System.out.println(number);
		do {
			System.out.print("请输入您的答案(1-100)：");
			answer = sc.nextInt();
			if(answer == number) {
				System.out.println("恭喜您！正确答案就是" + number +",您一共用了" + count + "次猜中正确答案！");
			}else if (answer > number) {
				System.out.println("大了！请再猜一次！");
				count++;
				//System.out.println("count = " + count);
			}else if (answer < number) {
				System.out.println("小了！请再猜一次！");
				count++;
				//System.out.println("count = " + count);
			}else {
				System.out.println("Error!");
			}
		}while (answer != number);
	}

	public static void methodWhile(int number) {
		//while实现
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 1;
		while (answer != number) {
			System.out.print("请输入您的答案（1-100）");
			answer = sc.nextInt();
			if (answer == number) {
				System.out.println("恭喜您！正确答案就是" + number + "！您一共用了" + count +"次猜中正确答案！");
			}else if (answer > number) {
				System.out.println("大了，请再猜一次！");
				count++;
			}else if (answer < number) {
				System.out.println("小了，请再猜一次！");
				count++;
			}else {
				System.out.println("ERROR!");
			}
		}
	}

	public static void methodFor(int number) {
		//for实现
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 1;
		for (count = 1;answer != number; count++) {
			System.out.print("请输入您的答案（1-100）：");
			answer = sc.nextInt();
			if (answer == number) {
				System.out.println("恭喜您！正确答案就是" + number + "！您一共用了" + count +"次猜中正确答案！");
			}else if (answer > number) {
				System.out.println("大了，请再猜一次！");
			}else if (answer < number) {
				System.out.println("小了，请再猜一次！");
			}else {
				System.out.println("ERROR!");
			}
		}
	}
}



