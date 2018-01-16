package com.java.test;

import java.util.Scanner;

public class StringTraverse {
	
	/*
	 * 需求：字符串遍历
	 */
	public static void main(String[] args) {
		//从键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.nextLine();
		//对这个字符串进行遍历
		for (int i = 0; i < s.length() ; i++) {
			char c = s.charAt(i);
			System.out.println(c);
		}
	}

}
