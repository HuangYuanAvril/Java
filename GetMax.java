package java0;

import java.util.Scanner;

public class GetMax {

	/*
	 *�жϼ���¼����������е����ֵ
	 */
	public static void main(String[] args) {
		//����¼��������
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������֣�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		//ѡ�������е����ֵ
		int temp = 0;
		int max = 0;
		if (a > b) {
			temp = a;
			if(temp > c) {
				max = temp;
			}else {
				max = c;
			}
		}else if (a < b) {
			temp = b;
			if(temp > b) {
				max = temp;
			}else {
				max = b;
			}
		}else {
			System.out.println("ERROR");
		}
		//������ֵ
		System.out.println(max);
	}

}
