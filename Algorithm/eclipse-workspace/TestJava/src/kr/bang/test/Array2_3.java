package kr.bang.test;

import java.util.Scanner;

public class Array2_3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = s.nextInt();
		arr[2] = arr[0]-arr[1];
		System.out.printf("%d %d %d",arr[0],arr[1],arr[2]);
		while(true) {
			if(arr[2]<0) break;
			else {
				arr[0]=arr[1];
				arr[1]=arr[2];
				arr[2]=arr[0]-arr[1];
				System.out.printf(" %d",arr[2]);
			}
		}
	}

}
