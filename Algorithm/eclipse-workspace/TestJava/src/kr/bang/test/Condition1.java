package kr.bang.test;

import java.util.Scanner;

public class Condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr;
		numArr = new int[2];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			numArr[i] = s.nextInt();
		}
		int bmi=0;
		bmi = numArr[1] - numArr[0] + 100;
		System.out.println(bmi);
		if(bmi>0) System.out.println("Obesity");
	}

}
