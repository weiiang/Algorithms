package com.algorithms.sort;

import java.io.UnsupportedEncodingException;

/**
 * 直接插入排序
 * @author 函钛科技
 *
 */


public class InsertDirectlyIntoTheOrder {
	public static void main(String[] args) throws UnsupportedEncodingException {
		int [] arr = {5,2,4,1,3};
		display(insertDirectSort(arr));
		/*String source = "北|京";
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
			  //当插入的第i个数比有序数列的最后一个（i-1）大
			  if(a[i-1] > a[i]) {
				  temp = a[i];//a[j]表示插入的时候与之比较的数，a[j+1]表示要插入的数
				  for(j = i -1; j >= 0 && a[j] > temp; j-- ) {//j表示有序数列的个数
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
