package java0;

import java.util.Scanner;

public class DivisionAlgorithm {

	/*
	 * ʹ��շת����������Լ��
	 * 1������һ����Ϊ0������һ���������������������Լ��
	 * 2������a%b����a=b,b=����
	 */
	public static void main(String[] args) {
		//����������
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		//շת�����
		int gcd = 0;
		int temp = 0;
		if (a == 0) {
			gcd = b;
		}else if ( b == 0) {
			gcd = a;
		}else if (a != 0 && b != 0) {
			while( b != 0 ) {
				temp = a % b;
				a = b;
				b = temp;
			}
			gcd = a;
		}
		//���
		System.out.println(gcd);
		in.close();
	}

}
