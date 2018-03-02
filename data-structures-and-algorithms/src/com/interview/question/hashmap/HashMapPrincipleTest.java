package com.interview.question.hashmap;

import org.junit.jupiter.api.Test;

public class HashMapPrincipleTest {
	@Test//�������
	public void testBit() {
	  Integer a = 10;
	  Integer b = 20;
	  System.out.println(a.hashCode());//10
	  System.out.println(b.hashCode());//20
	  /**
	   * λ������㣺��ͬΪ0����ͬΪ1
	   * 	10: 1010
	   *  ^ 20:10100
	   * 	   11110:0+2+4+8+16=30
	   * 	
	   */
	  System.out.println(a.hashCode() ^ b.hashCode());//30
	  
	  String s1 = "����";
	  String s2 = "����";
	  System.out.println(s1.hashCode());//10
	  System.out.println(s2.hashCode());//20
	  System.out.println(s1.hashCode() ^ s2.hashCode());//30
	  
  }
}
