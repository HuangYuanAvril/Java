package java0;

import java.util.Scanner;

public class NumberReading {

	/*
	 * 你的程序要读入一个整数，范围是[-100000,100000]。
	 * 然后，用汉语拼音将这个整数的每一位输出出来。
	 * 
	 * 注意，每个字的拼音之间有一个空格，但是最后的字后面没有空格。
	 * 当遇到负数时，在输出的开头加上“fu”
	 */
	public static void main(String[] args) {
		//输入
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//朗读
		//朗读正负号
		if(number < 0) {
			System.out.print("fu ");
		}else if(number == 0) {
			System.out.print("ling");
		}
		number = Math.abs(number);
		//朗读数字部分
		//先将数字逆序
		int i = 0;		//暂时存放每个数位上的数
		int temp = 0;	//存放逆序后产生的新数字
		int flag = 0;	//记录末尾0的个数
		while (number != 0){
			i = number % 10;
			if(i == 0) {
				flag++;
			}
			temp = temp * 10 + i ;
			number = number / 10;
		}
		//从最低位开始依次朗读
		int j = 0;
		while (temp != 0) {
			j = temp % 10;
			switch (j) {
			default:
				System.out.print("ERROR");
				break;
			case 0:
				System.out.print("ling");
				break;
			case 1:
				System.out.print("yi");
				break;
			case 2:
				System.out.print("er");
				break;
			case 3:
				System.out.print("san");
				break;
			case 4:
				System.out.print("si");
				break;
			case 5:
				System.out.print("wu");
				break;
			case 6:
				System.out.print("liu");
				break;
			case 7:
				System.out.print("qi");
				break;
			case 8:
				System.out.print("ba");
				break;
			case 9:
				System.out.print("jiu");
				break;
			}
			if(temp > 10) {
				System.out.print(" ");
			}
			temp = temp / 10;
		}
		while(flag != 0) {
			System.out.print(" ling");
			flag--;
		}
		
		sc.close();
	}

}
