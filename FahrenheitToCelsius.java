package java0;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	/*
	 * дһ���������¶�ת���������¶ȵĳ���ת���Ĺ�ʽ�ǣ�

		    ��F = (9/5)*��C + 32
		
		����C��ʾ�����¶ȣ�F��ʾ�����¶ȡ�
		
		�����������һ����������ʾ�����¶ȡ������Ӧ�������¶ȣ�Ҳ��һ��������
		
		��ʾ��Ϊ�˰Ѽ������ĸ�����ת������������Ҫʹ������ı��ʽ��
		
		    (int)x;
		
		����x��Ҫת�����Ǹ���������
	 */
	public static void main(String[] args) {
		//¼�뻪�϶�
		Scanner sc = new Scanner(System.in);
		//System.out.println("�¶Ȼ���");
		//System.out.println("�����뻪�϶ȣ�");
		int f = sc.nextInt();
		//��λת��
		double c = ( f - 32.0 ) * 5 / 9;
		System.out.println((int)c);
	}

}
