package com.java.test;

import java.util.Scanner;

public class login {

	/*
	 * ����ģ���½�������λ��ᣬ����ʾ��ʣ�¼���
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----ע��-----");
		System.out.println("�������û�����");
		String name = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		System.out.println("ע��ɹ���");
		
		System.out.println("-----��½-----");
		for (int count  = 3; count > 0; count--) {
			System.out.println("����" + count + "����");
			System.out.println("�������û���(��ע�������Сд)��");
			String name_temp = sc.nextLine();
			System.out.println("���������루��ע�����ִ�Сд����");
			String password_temp = sc.nextLine();
			if (name_temp.equals(name) && password_temp.equals(password)) {
				System.out.println("��½�ɹ���");
				break;
			} else {
				System.out.println("��¼���������������");
			}
		}
		
		
	}
	

}
