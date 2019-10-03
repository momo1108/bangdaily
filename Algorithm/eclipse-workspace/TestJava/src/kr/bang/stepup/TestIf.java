package kr.bang.stepup;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		// 1. if 문
		// new - 메모리 loading(HDD 데이터를 RAM으로 읽어론다.)
		Scanner s = new Scanner(System.in);
		// s 에다가 하드에서 불러온 Scanner에 주소를 기록하는데 type을 Scanner라고 선언한다.
		// System.in : 표준입력장치(키보드), System.out : 표준출력장치(모니터)
		int score=s.nextInt(); // 키보드로부터 정수를 입력받는다. 단어가 섞였을 때는 두번째 단어의 시작을 대문자로 한다.
		System.out.println(score);
		// 1. if
		if(score>=70) {
			System.out.println("합격");
		}
		// 2. if
		if(score>=70) {
			System.out.println("PASS~~");
		}else {
			System.out.println("FAIL~~");
		}
		// 3. if
		if(score>=90) {
			System.out.println("A학점");
		}else if(score>=80) {
			System.out.println("B학점");
		}else if(score>=70) {
			System.out.println("C학점");
		}else if(score>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
	}

}
