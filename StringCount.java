package com.java.test;

import java.util.Scanner;

public class StringCount {

	/*
	 * 需求：统计一个字符串中大写字母字符，小写字母字符，数字字符，其他字符出现的个数
	 * 思考：如何区分字符类型？
	 * 		String类有方法可以直接调用么？没有。。。只能自己写
	 * 		想到ASCII码表，则通过其存储在内存中的数值所处范围区分
	 * 		大写字母：
	 */
	public static void main(String[] args) {
		//录入一个字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一组字符，我们将为您统计这串字符中，各种类型字符的个数");
		String s = sc.nextLine();
		int upperLetter = 0;	//大写字母计数器
		int lowerLetter = 0;	//小写字母计数器
		int number = 0;			//数字计数器
		int other = 0;			//其他字符
		//分别获取字符串中的每一个字符
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			//判断当前字符的类型，并计数
			if (c >= 'A' && c <= 'Z') {
				upperLetter ++;
			} else if (c >= 'a' && c <= 'z') {
				lowerLetter ++;
			} else if (c >= '0' && c <= '9') {
				number ++;
			} else {
				other ++;
			}
		}
		System.out.println("该字符串中一共有" + upperLetter +"个大写字母，" + lowerLetter + "个小写字母," 
										+ number +"个数字，" + other + "个其他字符");
	}

}
