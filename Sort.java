package com.java.stringbuffer;

import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		//数据初始化
		Scanner sc = new Scanner(System.in);
		System.out.println("请问您想对多少个数据进行排序？");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("请依次输入您的数据：");
		for (int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//冒泡排序——小的前置
		System.out.print("冒泡排序结果：");
		bubbleSort(arr);
		printf(arr);
		//选择排序——大的后置
		System.out.print("选择排序结果：");
		selectSort(arr);
		printf(arr);

	}

	//打印数组
	public static void printf(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	//选择排序
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

	//冒泡排序
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
