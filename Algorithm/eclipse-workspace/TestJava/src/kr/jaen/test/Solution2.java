package kr.jaen.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution2 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setIn(new FileInputStream("Solution2.txt"));
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int direction;
		// 0~�� ����, 0~�� ���� ���� ��ġ���� ���ĵ� ���м����� ĭ�� �����ش�.
		int line = s.nextInt();
		for(int a=0; a<line*2; a++){
			direction = s.nextInt();
			
		}
	}

}
