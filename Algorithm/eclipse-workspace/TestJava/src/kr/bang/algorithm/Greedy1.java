package kr.bang.algorithm;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Greedy1 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// �ܾ簣 ������ �Ÿ��� �� �� ���� �����ؼ� ���ڸ� �������� �κ����� ���Ѵ�.
		System.setIn(new FileInputStream("Greedy2.txt"));
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		Arrays.sort(conference, new Comparator<int[]>() {
            // Override�� compare �Լ��� ��� �����ϳĿ� ���� �پ��� ������ ���������ϴ�
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
	}

}