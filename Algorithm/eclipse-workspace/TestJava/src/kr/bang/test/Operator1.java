package kr.bang.test;

import java.util.Scanner;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] grade;
		grade = new int[3];
		for(int i=0; i<3; i++) {
			grade[i] = s.nextInt();
		}
		int sum=0;
		int avg;
		for(int e : grade) {
			sum += e;
		}
		avg = sum/3;
//		System.out.println("sum "+sum);
//		System.out.println("avg "+avg);
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}

}
