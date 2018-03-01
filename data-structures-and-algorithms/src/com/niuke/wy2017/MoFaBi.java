package com.niuke.wy2017;

import java.util.Scanner;

/**
 *  魔法机器1:如果投入x个魔法币,魔法机器会将其变为2x+1个魔法币
 *	魔法机器2:如果投入x个魔法币,魔法机器会将其变为2x+2个魔法币
 *	小易采购魔法神器总共需要n个魔法币,所以小易只能通过两台魔法机器产生恰好n个魔法币,小易需要你帮他设计一个投入方案使他最后恰好拥有n个魔法币。 
 * @author 函钛科技
 *
 */
/**
 * 三种情况： 1.只投币给第一台机器 2.只投币给第二台机器 3.混合投币
 * 
 * @author 函钛科技
 *
 */
public class MoFaBi {

	// 需要的魔法币的数量
	private static Integer n = 0;

	public static void main(String[] args) {
		System.out.println(magic(10));
	}

	// 获取输入的n
	@SuppressWarnings("resource")
	public static void input() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
	}

	public static String magic(int x) {
		if (x == 0) {
			return "";
		} else if (x % 2 == 0 && x != 0) {
			return magic((x - 2) / 2) + "2";
		} else {
			return magic((x - 1) / 2) + "1";
		}
	}

}
