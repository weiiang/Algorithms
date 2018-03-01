package com.niuke.wy2017;

import java.util.Scanner;

//射击游戏
/*小易正在玩一款新出的射击游戏,这个射击游戏在一个二维平面进行,
 * 小易在坐标原点(0,0),平面上有n只怪物,每个怪物有所在的坐标(x[i], y[i])。
 * 小易进行一次射击会把x轴和y轴上(包含坐标原点)的怪物一次性消灭。
小易是这个游戏的VIP玩家,他拥有两项特权操作:
1、让平面内的所有怪物同时向任意同一方向移动任意同一距离
2、让平面内的所有怪物同时对于小易(0,0)旋转任意同一角度
小易要进行一次射击。小易在进行射击前,可以使用这两项特权操作任意次。
小易想知道在他射击的时候最多可以同时消灭多少只怪物,请你帮帮小易。

如样例所示:

所有点对于坐标原点(0,0)顺时针或者逆时针旋转45°,可以让所有点都在坐标轴上,所以5个怪物都可以消灭。

输入描述:
输入包括三行。
第一行中有一个正整数n(1 ≤ n ≤ 50),表示平面内的怪物数量。
第二行包括n个整数x[i](-1,000,000 ≤ x[i] ≤ 1,000,000),表示每只怪物所在坐标的横坐标,以空格分割。
第二行包括n个整数y[i](-1,000,000 ≤ y[i] ≤ 1,000,000),表示每只怪物所在坐标的纵坐标,以空格分割。


输出描述:
输出一个整数表示小易最多能消灭多少只怪物。

输入例子1:
5
0 -1 1 1 -1
0 -1 -1 1 1

输出例子1:
5
*/
/**
 * 
 * @author 函钛科技
 *思路：先定三个点，可以确定坐标轴和远点，所以这三个点经过上面两种操作怎么都能移动到两条坐标轴上
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
		//这个地方为什么不能用
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
