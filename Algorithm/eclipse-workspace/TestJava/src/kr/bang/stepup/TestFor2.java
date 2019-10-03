package kr.bang.stepup;

import java.util.Scanner;

public class TestFor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 숫자를 입력받아 그들의 합을 구하세요
		Scanner s=new Scanner(System.in);
		// 키보드로부터 갯수를 입력 받는다.
		int n=s.nextInt();
		int[] numarr=new int[n]; // n개의 정수를 담을 수 있는 메모리(배열 선언)할당 자동으로 0으로 채워짐 - 똑같은 type의 data가 여러개 왔을 때 사용
		int total=0;
		for(int i=0; i<n; i++) {
			numarr[i]=s.nextInt();
		}
		for(int i=0; i<n; i++) {
			total+=numarr[i];
		}
		System.out.println(total);
		int total2=0;
		for(int numele : numarr) { // for ~ each 합계 구하기. 이게 위처럼 배열 위치를 직접 읽어오는 것보다 for문보다 데이터 읽어오는 속도가 빠르다.
			total2+=numele;
		}
		System.out.println(total2);
	}

}
