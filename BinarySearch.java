package com.java.stringbuffer;

import java.util.Scanner;

public class BinarySearch {

	//二分查找
	public static void main(String[] args) {
		//数组初始化
		Scanner sc = new Scanner(System.in);
		System.out.println("您的数据总量是：");
		int length = sc.nextInt();
		int[] arr = new int[length];
		System.out.println("请输入您的全部数据：");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		//排序（采用冒泡排序）
		for (int i = 0 ; i < arr.length - 1 ; i++) {
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[j] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//打印排列后的有序数组
		System.out.println("您的数据排序后如下：");
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//查找
		System.out.println("请输入您需要查找的数据：");
		int value = sc.nextInt();
		int index = getIndex(arr,value);
		if(index != -1) {
			System.out.println(value + "是第" + index + "个数。");
		}else {
			System.out.println(value + "不存在于您的数据中。");
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


