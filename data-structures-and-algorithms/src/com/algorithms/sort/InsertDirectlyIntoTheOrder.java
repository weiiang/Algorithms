package com.algorithms.sort;

import java.io.UnsupportedEncodingException;

/**
 * ֱ�Ӳ�������
 * @author ���ѿƼ�
 *
 */


public class InsertDirectlyIntoTheOrder {
	public static void main(String[] args) throws UnsupportedEncodingException {
		int [] arr = {5,2,4,1,3};
		display(insertDirectSort(arr));
		/*String source = "��|��";
		String returnUniCode=null;
		 String uniCodeTemp=null;
		 for(int i=0;i<source.length();i++){
		  uniCodeTemp = "\\u"+Integer.toHexString((int)source.charAt(i));
		  System.out.println(source.charAt(i));
		  returnUniCode=returnUniCode==null?uniCodeTemp:returnUniCode+uniCodeTemp;
		 }
		 System.out.print(source +" 's unicode = "+returnUniCode);*/
	}
	
	public static int []  insertDirectSort(int [] a) {
		  int i,j,temp;
		  int len = a.length;
		  for(i = 1; i < len; i++) {
			  //������ĵ�i�������������е����һ����i-1����
			  if(a[i-1] > a[i]) {
				  temp = a[i];//a[j]��ʾ�����ʱ����֮�Ƚϵ�����a[j+1]��ʾҪ�������
				  for(j = i -1; j >= 0 && a[j] > temp; j-- ) {//j��ʾ�������еĸ���
					  a[j+1] = a[j];
				  }
				  a[j+1] = temp;
			  }
		  }
		return a;
	}
	public static void display(int [] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]+"\t");
		}
	}

}
