package kr.bang.stepup;

import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String key = s.nextLine();
		String sentence = s.nextLine();
		System.out.println(key+", length : "+key.length());
		for(int i=0; i<sentence.length(); i++) {
//			System.out.println((int)'A'); A : 65 ~ 90 , a : 97 ~ 122, 32
			if(sentence.charAt(i)==' ') System.out.print(' ');
			else if(sentence.charAt(i)>='a') {
				System.out.print(key.charAt(sentence.charAt(i)-97));
			} else {
				System.out.print((char)(key.charAt(sentence.charAt(i)-65)-32));
			}
			
		}
	}
}
