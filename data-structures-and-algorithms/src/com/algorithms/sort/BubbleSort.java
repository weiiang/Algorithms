package com.algorithms.sort;
/**
 * ð������
 * @author ���ѿƼ�
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int [] a = {1,3,2,-1,10};
		SortUtils.print(bubbleSort(a));
	}
	public static int [] bubbleSort(int [] a) {
		int len = a.length;
		//�������������
		for (int i = 0; i < len; i++) {
			//ÿ�˱ȽϵĴ���  �������ң���һ������ʼ������j=0
			for (int j = 0; j < len - i -1; j++) {
				//���ǰ�߱Ⱥ��ߴ󽻻�λ��
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
