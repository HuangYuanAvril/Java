package com.java.stringbuffer;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		//���ݳ�ʼ��
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Զ��ٸ����ݽ�������");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("�����������������ݣ�");
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//ð�����򡪡�С��ǰ��
		System.out.print("ð����������");
		bubbleSort(arr);
		printf(arr);
		//ѡ�����򡪡���ĺ���
		System.out.print("ѡ����������");
		selectSort(arr);
		printf(arr);

	}

	//��ӡ����
	public static void printf(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//ѡ������
	public static void selectSort(int[] arr) {
		for (int j = 0 ; j < arr.length - 1; j++) {
			int temp = arr[j];
			for (int i = j + 1 ; i < arr.length  ; i++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	//ð������
	public static void bubbleSort(int[] arr) {
		for(int j = 0 ; j < arr.length - 1; j++) {
			for(int i = j ; i < arr.length - 1; i++) {
				int temp = arr[i];
				if(arr[i] > arr[i+1]) {
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
			
		}
	}

}
