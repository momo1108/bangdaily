package kr.bang.test;

import java.util.Scanner;

public class Array2_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = new int[10];
		int x, index = 0;
		while(true) {
			x = s.nextInt();
			if(x==0) break;
			arr[x/10]++;
		}
		for(int e : arr) {
			if(e==0) {
				index++;
				continue;
			}
			else {
				System.out.println(index+" : "+e);
				index++;
			}
		}
	}

}
