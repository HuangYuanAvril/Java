package java0;

import java.util.Scanner;

public class OddEvenNumberCount {

	/*
	 * ��ĳ���Ҫ����һϵ�����������ݣ�����-1��ʾ���������-1��������������ݡ�
	 * ������������������е�������ż���ĸ�����
	 */
	public static void main(String[] args) {
		//��������
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int odd = 0;	//ż��������
		int even = 0;	//����������
		while (temp != -1) {
			if (temp % 2 == 0) {
				odd++;
			}else {
				even++;
			}
			temp = sc.nextInt();
		}
		
		//���
		System.out.println(even + " " + odd);
		
	}

}
