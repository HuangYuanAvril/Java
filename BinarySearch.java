package com.java.stringbuffer;

import java.util.Scanner;

public class BinarySearch {

	//���ֲ���
	public static void main(String[] args) {
		//�����ʼ��
		Scanner sc = new Scanner(System.in);
		System.out.println("�������������ǣ�");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("����������ȫ�����ݣ�");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//���򣨲���ð������
		for (int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//��ӡ���к����������
		System.out.println("����������������£�");
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//����
		System.out.println("����������Ҫ���ҵ����ݣ�");
		int value = sc.nextInt();
		int index = getIndex(arr,value);
		if(index != -1) {
			System.out.println(value + "�ǵ�" + index + "������");
		}else {
			System.out.println(value + "�����������������С�");
		}
			

	}
	
	public static int getIndex(int[] arr ,int  value) {
		int min = 0;
		int max = arr.length - 1;
		int middle = (min + max)/2;
		while(value != arr[middle]) {
			if(value < arr[middle]) {
				max = middle - 1;
			}else if(value > arr[middle]) {
				min = middle + 1;
			}
			middle = (min + max)/2;
			
			if(min > max) {
				return -1;
			}
		}
		return middle;
	}

}


