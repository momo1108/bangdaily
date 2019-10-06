package kr.bang.algorithm;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// 외양간 사이의 거리가 먼 것 부터 정렬해서 판자를 나눠쓰는 부분으로 정한다.
		System.setIn(new FileInputStream("Greedy2.txt"));
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		Arrays.sort(conference, new Comparator<int[]>() {
            // Override된 compare 함수를 어떻게 정의하냐에 따라서 다양한 정렬이 가능해집니다
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
	}

}
