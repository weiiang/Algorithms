package com.interview.question.hashmap;

import org.junit.jupiter.api.Test;

public class HashMapPrincipleTest {
	@Test//异或运算
	public void testBit() {
	  Integer a = 10;
	  Integer b = 20;
	  System.out.println(a.hashCode());//10
	  System.out.println(b.hashCode());//20
	  /**
	   * 位异或运算：相同为0，不同为1
	   * 	10: 1010
	   *  ^ 20:10100
	   * 	   11110:0+2+4+8+16=30
	   * 	
	   */
	  System.out.println(a.hashCode() ^ b.hashCode());//30
	  
	  String s1 = "张三";
	  String s2 = "李四";
	  System.out.println(s1.hashCode());//10
	  System.out.println(s2.hashCode());//20
	  System.out.println(s1.hashCode() ^ s2.hashCode());//30
	  
  }
}
