package kr.bang.test;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, check, odd = 0, even = 0;
		while(true) {
			n = s.nextInt();
			if(n==0) {
				System.out.println("odd : "+odd);
				System.out.println("even : "+even);
				break;
			} else if(n>0) {
				check = n/2*2;
				if(n==check) even++;
				else odd++;
			}
		}
	}

}
