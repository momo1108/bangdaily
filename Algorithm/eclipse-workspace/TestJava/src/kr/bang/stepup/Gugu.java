package kr.bang.stepup;

import java.util.Scanner;

public class Gugu {
	public static void gugudan(int[] arr) {
		for(int i=1; i<10; i++) {
			for(int e : arr) {
				System.out.printf("%d * %d = %2d   ",e,i,e*i);
			}
			System.out.println();
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int[] guguarr;
		while(a<2 || a>9 || b<2 || b>9) {
			System.out.println("INPUT ERROR!");
			a = s.nextInt();
			b = s.nextInt();
		}
		if(a==b) {
			guguarr = new int[1];
			guguarr[0] = a;
		} else if(a>b) {
			guguarr = new int[a-b+1]; 
			for(int i=a; i>=b; i--) {
				guguarr[a-i] = i; 
			}
		} else {
			guguarr = new int[b-a+1]; 
			for(int i=a; i<=b; i++) {
				guguarr[i-a] = i; 
			}
		}
		gugudan(guguarr);
	}
}
