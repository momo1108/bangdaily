package kr.bang.stepup;

import java.util.Scanner;

public class NumberBaseball {
	static int strike = 0;
	static int ball = 0;
	static int Answer = 0;
	public static void check(String victim, String[] question) {
		for(String e : question) {
			strike = 0;
			ball = 0;
			// Strike check
			for(int i=0; i<3; i++) {
				if(victim.charAt(i)==e.charAt(i)) strike++;
				// Ball check
				for(int j=0; j<3; j++) {
					if(j==i) continue;
					if(victim.charAt(i)==e.charAt(j)) ball++;
				}
			}
			if((char)strike+48==e.charAt(4) && (char)ball+48==e.charAt(6)) {
				//System.out.printf("\n%s - strike : %d, ball : %d, question : %s\n",victim, strike,ball,e);
			} else return;
		}
		//System.out.println(victim);
		Answer++;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		s.nextLine();
		String victim;
		String[] question = new String[N];
		/*
		 * n��° ������ ������ �����ϸ� n+1���� �������� �ٽ� ȣ���Ѵ�.
		 * �Լ��� ���ڷδ� index, ������ ���� �����ߴ��� üũ�ϱ� ���� correct boolean,
		 * �������� ������ ���ڸ� String, �׸��� �Է¹��� �������� String �迭�� �ʿ��ϴ�.
		 */ 
		for(int i=0; i<N; i++) {
			question[i] = s.nextLine();
		}
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(j==i) continue;
				for(int k=1; k<10; k++) {
					if(k==i || k==j) continue;
					else {
						victim = (Integer.toString(i)+Integer.toString(j)+Integer.toString(k));
						check(victim, question);
					}
				}
			}
		}
		System.out.println(Answer);
	}
}