package java0;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		//��ʼ��
		Scanner sc = new Scanner(System.in);
		//����Ʊ��
		System.out.println("��Ͷ�ң�");
		int amount = sc.nextInt();
		//����
		int change = amount - 10;
		if(change > 0) {			
			//��ʾ���
			System.out.println("**************");
			System.out.println("*Java�Ǽ���·ר��*");
			System.out.println("*  ��ָ����λƱ       *");
			System.out.println("*  Ʊ�ۣ�10Ԫ         *");
			System.out.println("***************");
			System.out.println("���㣺"+(amount-10));
		}else {
			System.out.println("���㣡����Ҫ" + (10-amount)+"Ԫ");
		}
	}

}
