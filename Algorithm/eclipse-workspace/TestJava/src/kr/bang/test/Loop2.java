package kr.bang.test;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		while(true) {
			n = s.nextInt();
			if(n>0 && n<=100) {
				int sum = 0;
				for(int i=1; i<=n; i++) {
					sum += i;
				}
				System.out.println(sum);
				break;
			}
		}
	}

}
