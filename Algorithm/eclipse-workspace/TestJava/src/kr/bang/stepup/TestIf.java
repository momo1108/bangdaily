package kr.bang.stepup;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		// 1. if ��
		// new - �޸� loading(HDD �����͸� RAM���� �о�д�.)
		Scanner s = new Scanner(System.in);
		// s ���ٰ� �ϵ忡�� �ҷ��� Scanner�� �ּҸ� ����ϴµ� type�� Scanner��� �����Ѵ�.
		// System.in : ǥ���Է���ġ(Ű����), System.out : ǥ�������ġ(�����)
		int score=s.nextInt(); // Ű����κ��� ������ �Է¹޴´�. �ܾ ������ ���� �ι�° �ܾ��� ������ �빮�ڷ� �Ѵ�.
		System.out.println(score);
		// 1. if
		if(score>=70) {
			System.out.println("�հ�");
		}
		// 2. if
		if(score>=70) {
			System.out.println("PASS~~");
		}else {
			System.out.println("FAIL~~");
		}
		// 3. if
		if(score>=90) {
			System.out.println("A����");
		}else if(score>=80) {
			System.out.println("B����");
		}else if(score>=70) {
			System.out.println("C����");
		}else if(score>=60) {
			System.out.println("D����");
		}else {
			System.out.println("F����");
		}
	}

}