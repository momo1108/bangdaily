package kr.bang.stepup;

import java.util.Scanner;

// ������ ���� Ŭ���� �̸��� Main���� �ؾ��Ѵ�.
// �ۼ��ø� �ڿ� ��ȣ�� ���̰� ����ÿ� ������ Main�� ��������.
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int su=s.nextInt();
		System.out.println(su);
		if(su<0) {
			System.out.println("minus");
		}
	}

}
