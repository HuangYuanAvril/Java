package java0;

import java.util.Scanner;

public class NumberReading {

	/*
	 * ��ĳ���Ҫ����һ����������Χ��[-100000,100000]��
	 * Ȼ���ú���ƴ�������������ÿһλ���������
	 * 
	 * ע�⣬ÿ���ֵ�ƴ��֮����һ���ո񣬵��������ֺ���û�пո�
	 * ����������ʱ��������Ŀ�ͷ���ϡ�fu��
	 */
	public static void main(String[] args) {
		//����
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		//�ʶ�
		//�ʶ�������
		if(number < 0) {
			System.out.print("fu ");
		}else if(number == 0) {
			System.out.print("ling");
		}
		number = Math.abs(number);
		//�ʶ����ֲ���
		//�Ƚ���������
		int i = 0;		//��ʱ���ÿ����λ�ϵ���
		int temp = 0;	//�������������������
		int flag = 0;	//��¼ĩβ0�ĸ���
		while (number != 0){
			i = number % 10;
			if(i == 0) {
				flag++;
			}
			temp = temp * 10 + i ;
			number = number / 10;
		}
		//�����λ��ʼ�����ʶ�
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
