package test;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		// 랜덤을 연습 해보자
		Random rd = new Random();
		int a = rd.nextInt(9)+1;   // 1~10까지 난수 인가?
		System.out.println("랜덤값: " + a);

	}

}
