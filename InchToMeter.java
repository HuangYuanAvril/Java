package java0;

import java.util.Scanner;

public class InchToMeter {

	/*
	 * 将英尺计数表示的身高转化为单位米
	 */
	public static void main(String[] args) {
		int foot = 0;	//英尺
		int inch = 0;	//英寸
		double meter = 0.0 ;	//米
		//身高录入
		Scanner sc = new Scanner(System.in);
		System.out.println("身高换算");
		System.out.println("英尺：");
		foot  = sc.nextInt();
		System.out.println("英寸：");
		inch = sc.nextInt();
		//单位换算
		meter = (foot + inch / 12.0) * 0.3048;
		//此处注意，如果12.0改成12，则有一定概率出错，因为此处除法是int的除法，会损失精度
		System.out.println("您的身高是：" + meter + "米");
		
		
	}

}
