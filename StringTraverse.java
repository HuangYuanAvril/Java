package com.java.test;

import java.util.Scanner;

public class StringTraverse {
	
	/*
	 * �����ַ�������
	 */
	public static void main(String[] args) {
		//�Ӽ���¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String s = sc.nextLine();
		//������ַ������б���
		for (int i = 0; i < s.length() ; i++) {
			char c = s.charAt(i);
			System.out.println(c);
		}
	}

}
