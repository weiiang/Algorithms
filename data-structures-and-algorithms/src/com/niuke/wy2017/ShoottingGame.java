package com.niuke.wy2017;

import java.util.Scanner;

//�����Ϸ
/*С��������һ���³��������Ϸ,��������Ϸ��һ����άƽ�����,
 * С��������ԭ��(0,0),ƽ������nֻ����,ÿ�����������ڵ�����(x[i], y[i])��
 * С�׽���һ��������x���y����(��������ԭ��)�Ĺ���һ��������
С���������Ϸ��VIP���,��ӵ��������Ȩ����:
1����ƽ���ڵ����й���ͬʱ������ͬһ�����ƶ�����ͬһ����
2����ƽ���ڵ����й���ͬʱ����С��(0,0)��ת����ͬһ�Ƕ�
С��Ҫ����һ�������С���ڽ������ǰ,����ʹ����������Ȩ��������Ρ�
С����֪�����������ʱ��������ͬʱ�������ֻ����,������С�ס�

��������ʾ:

���е��������ԭ��(0,0)˳ʱ�������ʱ����ת45��,���������е㶼����������,����5�����ﶼ��������

��������:
����������С�
��һ������һ��������n(1 �� n �� 50),��ʾƽ���ڵĹ���������
�ڶ��а���n������x[i](-1,000,000 �� x[i] �� 1,000,000),��ʾÿֻ������������ĺ�����,�Կո�ָ
�ڶ��а���n������y[i](-1,000,000 �� y[i] �� 1,000,000),��ʾÿֻ�������������������,�Կո�ָ


�������:
���һ��������ʾС��������������ֻ���

��������1:
5
0 -1 1 1 -1
0 -1 -1 1 1

�������1:
5
*/
/**
 * 
 * @author ���ѿƼ�
 *˼·���ȶ������㣬����ȷ���������Զ�㣬�����������㾭���������ֲ�����ô�����ƶ���������������
 */
public class ShoottingGame {
	class M{
		public int x = 0;
		public int y = 0;
		public M() {}
		public M(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����ط�Ϊʲô������
		String n = sc.nextLine();
		String xStr = sc.nextLine();
		String yStr = sc.nextLine();
		sc.close();
		String [] xSArray = xStr.split(" ");
		String [] ySArray = yStr.split(" ");
		System.out.println(xSArray.length);
		System.out.println(ySArray.length);
		M [] mArray = new M [Integer.parseInt(n)];
//		for(int i = 0; i < mArray.length; i++) {
//			if(xSArray[i] != null && ySArray[i] != null) {
//				mArray[i].x = Integer.parseInt(xSArray[i]);
//				mArray[i].y = Integer.parseInt(ySArray[i]);
//			}
//			
//		}
		System.out.println(mArray[0].x);
		
			
	}

}
