package java0;

import java.util.Scanner;

public class InchToMeter {

	/*
	 * ��Ӣ�߼�����ʾ�����ת��Ϊ��λ��
	 */
	public static void main(String[] args) {
		int foot = 0;	//Ӣ��
		int inch = 0;	//Ӣ��
		double meter = 0.0 ;	//��
		//���¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("��߻���");
		System.out.println("Ӣ�ߣ�");
		foot  = sc.nextInt();
		System.out.println("Ӣ�磺");
		inch = sc.nextInt();
		//��λ����
		meter = (foot + inch / 12.0) * 0.3048;
		//�˴�ע�⣬���12.0�ĳ�12������һ�����ʳ�����Ϊ�˴�������int�ĳ���������ʧ����
		System.out.println("��������ǣ�" + meter + "��");
		
		
	}

}
