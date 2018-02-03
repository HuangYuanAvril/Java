package java0;

import java.util.Scanner;

public class RadioReport {
	/*
	 * 题目内容：
		无线电台的RS制信号报告是由三两个部分组成的：
		R(Readability) 信号可辨度即清晰度.
		S(Strength)    信号强度即大小.
		其中R位于报告第一位，共分5级，用1—5数字表示.
		1---Unreadable
		2---Barely readable, occasional words distinguishable
		3---Readable with considerable difficulty
		4---Readable with practically no difficulty
		5---Perfectly readable
		报告第二位是S，共分九个级别，用1—9中的一位数字表示
		1---Faint signals, barely perceptible
		2---Very weak signals
		3---Weak signals
		4---Fair signals
		5---Fairly good signals
		6---Good signals
		7---Moderately strong signals
		8---Strong signals
		9---Extremely strong signals
		现在，你的程序要读入一个信号报告的数字，然后输出对应的含义。
	 */
	public static void main(String[] args) {
		//读入信号报告数字
		Scanner sc = new Scanner(System.in);
		//判断报告内容
		int rs = sc.nextInt();
		int r = rs / 10;
		int s = rs % 10;
		//输出
		if (rs >= 11 && rs <= 59) {
			switch(s) {
			default:
				System.out.print("ERROR; ");
				break;
			case 1:
				System.out.print("Faint signals, barely perceptible, ");
				break;
			case 2:
				System.out.print("Very weak signals, ");
				break;
			case 3:
				System.out.print("Weak signals, ");
				break;
			case 4:
				System.out.print("Fair signals, ");
				break;
			case 5:
				System.out.print("Fairly good signals, ");
				break;
			case 6:
				System.out.print("Good signals,");
				break;
			case 7:
				System.out.print("Moderately strong signals,");
				break;
			case 8:
				System.out.print("Strong signals,");
				break;
			case 9:
				System.out.print("Extremely strong signals,");
				break;
			}
			switch(r) {
			case 1:
				System.out.print("unreadable");
				break;
			case 2:
				System.out.print("barely readable, occasional words distinguishable");
				break;
			case 3:
				System.out.print("readable with considerable difficulty");
				break;
			case 4:
				System.out.print("readable with practically no difficulty");
				break;
			case 5:
				System.out.print("perfectly readable");
				break;
			default:
				System.out.print("ERROR");
				break;
			}	
		}else {
			System.out.println("ERROR");
		}
	}

}
