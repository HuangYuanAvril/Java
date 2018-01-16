package com.java.test;

import java.util.Scanner;

public class login {

	/*
	 * 需求：模拟登陆，给三次机会，并提示还剩下几次
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----注册-----");
		System.out.println("请输入用户名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		System.out.println("注册成功！");
		
		System.out.println("-----登陆-----");
		for (int count  = 3; count > 0; count--) {
			System.out.println("还有" + count + "机会");
			System.out.println("请输入用户名(请注意区别大小写)：");
			String name_temp = sc.nextLine();
			System.out.println("请输入密码（请注意区分大小写）：");
			String password_temp = sc.nextLine();
			if (name_temp.equals(name) && password_temp.equals(password)) {
				System.out.println("登陆成功！");
				break;
			} else {
				System.out.println("登录名或密码输入错误！");
			}
		}
		
		
	}
	

}
