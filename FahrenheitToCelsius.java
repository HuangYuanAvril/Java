package java0;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	/*
	 * 写一个将华氏温度转换成摄氏温度的程序，转换的公式是：

		    °F = (9/5)*°C + 32
		
		其中C表示摄氏温度，F表示华氏温度。
		
		程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
		
		提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式：
		
		    (int)x;
		
		其中x是要转换的那个浮点数。
	 */
	public static void main(String[] args) {
		//录入华氏度
		Scanner sc = new Scanner(System.in);
		//System.out.println("温度换算");
		//System.out.println("请输入华氏度：");
		int f = sc.nextInt();
		//单位转换
		double c = ( f - 32.0 ) * 5 / 9;
		System.out.println((int)c);
	}

}
