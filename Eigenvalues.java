package java0;

import java.util.Scanner;

public class Eigenvalues {

	/*
	 * ��ĳ���Ҫ����һ���Ǹ������������ķ�Χ��[0,100000]��
	 * Ȼ���������㷨�������ʾ��ż�Ե��Ǹ����������֣��������Ӧ��ʮ����ֵ��
	 */
	public static void main(String[] args) {
		//����
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int eigenvalues = 0;	//����ֵ 
		int plus = 1;	//���ʮ�ı�������������Ӧ������ֵ�������Ӧ����λ��
		int temp = 0;	//���δ�Ÿ���λ�ϵ���
		int i = 1;		//��¼��λ
		while(number > 0) {
			temp = number % 10;	//ȡ�����λ
			if(temp % 2 == i % 2) {
				eigenvalues = eigenvalues + 1 * plus;
			}
			plus = plus * 2;
			number = number / 10;
			i++;
		}
		System.out.println(eigenvalues);

	}

}
