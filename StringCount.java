package com.java.test;

import java.util.Scanner;

public class StringCount {

	/*
	 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ��������ַ����ֵĸ���
	 * ˼������������ַ����ͣ�
	 * 		String���з�������ֱ�ӵ���ô��û�С�����ֻ���Լ�д
	 * 		�뵽ASCII�����ͨ����洢���ڴ��е���ֵ������Χ����
	 * 		��д��ĸ��
	 */
	public static void main(String[] args) {
		//¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ������ǽ�Ϊ��ͳ���⴮�ַ��У����������ַ��ĸ���");
		String s = sc.nextLine();
		int upperLetter = 0;	//��д��ĸ������
		int lowerLetter = 0;	//Сд��ĸ������
		int number = 0;			//���ּ�����
		int other = 0;			//�����ַ�
		//�ֱ��ȡ�ַ����е�ÿһ���ַ�
		for(int i = 0 ; i < s.length() ; i++) {
			char c = s.charAt(i);
			//�жϵ�ǰ�ַ������ͣ�������
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
		System.out.println("���ַ�����һ����" + upperLetter +"����д��ĸ��" + lowerLetter + "��Сд��ĸ," 
										+ number +"�����֣�" + other + "�������ַ�");
	}

}
