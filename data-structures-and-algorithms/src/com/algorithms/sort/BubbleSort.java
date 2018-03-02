package com.algorithms.sort;
/**
 * 冒泡排序
 * @author 函钛科技
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int [] a = {1,3,2,-1,10};
		SortUtils.print(bubbleSort(a));
	}
	public static int [] bubbleSort(int [] a) {
		int len = a.length;
		//控制排序的趟数
		for (int i = 0; i < len; i++) {
			//每趟比较的次数  从左向右，第一个数开始，所以j=0
			for (int j = 0; j < len - i -1; j++) {
				//如果前者比后者大交换位置
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;
	}
}
