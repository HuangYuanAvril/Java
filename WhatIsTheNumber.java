//������С��Ϸ��������1-100֮�䣩
import java.util.Scanner;

class WhatIsTheNumber {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = (int)(Math.random() * 100);
		System.out.println("----------------------------������С��Ϸ��---------------------------");
		System.out.println("ϵͳ����ÿ��ȷ��һ��1-100֮������֣���һ�������ڼ��β���������ְɣ�");
		System.out.println("��ѡ��ʵ�ֵ�ѭ��������1��for;	2��do while;	3��while;");
		int i = sc.nextInt();
		switch (i) {
			case 1:
				System.out.println("---------------����Ϊ��forѭ��ʵ��------------------");
				System.out.println("���Ѿ��������ȷ���֣��뿪ʼ�²���ȷ�𰸰ɣ�");
				methodFor(number);
				break;
			case 2:
				System.out.println("---------------����Ϊ��do whileѭ��ʵ��------------------");
				System.out.println("���Ѿ��������ȷ���֣��뿪ʼ�²���ȷ�𰸰ɣ�");
				methodDoWhile(number);
				break;
			case 3:
				System.out.println("---------------����Ϊ��whileѭ��ʵ��------------------");
				System.out.println("���Ѿ��������ȷ���֣��뿪ʼ�²���ȷ�𰸰ɣ�");
				methodWhile(number);
				break;
			default:
				System.out.println("ERROR!");
				break;
		}	
	}

	public static void methodDoWhile(int number){
		//do whileʵ��
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 1;
		//System.out.println(number);
		do {
			System.out.print("���������Ĵ�(1-100)��");
			answer = sc.nextInt();
			if(answer == number) {
				System.out.println("��ϲ������ȷ�𰸾���" + number +",��һ������" + count + "�β�����ȷ�𰸣�");
			}else if (answer > number) {
				System.out.println("���ˣ����ٲ�һ�Σ�");
				count++;
				//System.out.println("count = " + count);
			}else if (answer < number) {
				System.out.println("С�ˣ����ٲ�һ�Σ�");
				count++;
				//System.out.println("count = " + count);
			}else {
				System.out.println("Error!");
			}
		}while (answer != number);
	}

	public static void methodWhile(int number) {
		//whileʵ��
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 1;
		while (answer != number) {
			System.out.print("���������Ĵ𰸣�1-100��");
			answer = sc.nextInt();
			if (answer == number) {
				System.out.println("��ϲ������ȷ�𰸾���" + number + "����һ������" + count +"�β�����ȷ�𰸣�");
			}else if (answer > number) {
				System.out.println("���ˣ����ٲ�һ�Σ�");
				count++;
			}else if (answer < number) {
				System.out.println("С�ˣ����ٲ�һ�Σ�");
				count++;
			}else {
				System.out.println("ERROR!");
			}
		}
	}

	public static void methodFor(int number) {
		//forʵ��
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int count = 1;
		for (count = 1;answer != number; count++) {
			System.out.print("���������Ĵ𰸣�1-100����");
			answer = sc.nextInt();
			if (answer == number) {
				System.out.println("��ϲ������ȷ�𰸾���" + number + "����һ������" + count +"�β�����ȷ�𰸣�");
			}else if (answer > number) {
				System.out.println("���ˣ����ٲ�һ�Σ�");
			}else if (answer < number) {
				System.out.println("С�ˣ����ٲ�һ�Σ�");
			}else {
				System.out.println("ERROR!");
			}
		}
	}
}



