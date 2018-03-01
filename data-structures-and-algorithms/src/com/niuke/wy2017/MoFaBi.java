package com.niuke.wy2017;

import java.util.Scanner;

/**
 *  ħ������1:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+1��ħ����
 *	ħ������2:���Ͷ��x��ħ����,ħ�������Ὣ���Ϊ2x+2��ħ����
 *	С�ײɹ�ħ�������ܹ���Ҫn��ħ����,����С��ֻ��ͨ����̨ħ����������ǡ��n��ħ����,С����Ҫ��������һ��Ͷ�뷽��ʹ�����ǡ��ӵ��n��ħ���ҡ� 
 * @author ���ѿƼ�
 *
 */
/**
 * ��������� 1.ֻͶ�Ҹ���һ̨���� 2.ֻͶ�Ҹ��ڶ�̨���� 3.���Ͷ��
 * 
 * @author ���ѿƼ�
 *
 */
public class MoFaBi {

	// ��Ҫ��ħ���ҵ�����
	private static Integer n = 0;

	public static void main(String[] args) {
		System.out.println(magic(10));
	}

	// ��ȡ�����n
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
