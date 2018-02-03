package java0;

import java.util.Scanner;

public class PrimeSum {

	/*
	 * ��Ŀ���ݣ�
		������Ϊ2�ǵ�һ��������3�ǵڶ���������5�ǵ������������������ơ�
		���ڣ�������������n��m��0<n<=m<=200��
		��ĳ���Ҫ�����n����������m������֮�����е������ĺͣ�������n�������͵�m��������
		
		�����ʽ:
		������������һ����ʾn���ڶ�����ʾm��
		
		�����ʽ��
		һ����������ʾ��n����������m������֮�����е������ĺͣ�������n�������͵�m��������
		
		����������
		2 4
		
		���������
		15
	 */
	public static void main(String[] args) {
		//����
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		//�ж�����
		int count = 0;	//����������
		int sum = 0;
		for(int i = 2; count <= m; i++) {
			if(isPrime(i) != 0) {
				count++;
			}
			if(count >= n && count <= m) {				
				sum = sum + isPrime(i);
			}
		}
		System.out.println(sum);
		sc.close();
	}
	
	public static int isPrime(int a) {
		for(int i = 2;i < a;i++) {
			if(a % i == 0) {
				return 0;
			}
		}
		return a;	
	}

}
