package com.human.ex20221012;

import java.util.Arrays;

public class TopScoreStudent {
	public static void main(String[] args) {
// 배열 생성
		String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton" };
		int[] scores = { 65, 74, 23, 75, 68, 96, 88, 98, 94 };
// 1등 인덱스 검색
		int i = topIndex(scores);
// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
		
		int j = lowIndex(scores);
		
		System.out.printf("꼴등: %s(%d점)\n", names[j], scores[j]);

	}

// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	public static int topIndex(int[] scores) {
		int max = scores[0];
		int maxIndex = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>max) {
				max = scores[i];
				maxIndex =i;
			}
		}
//		a = Arrays.stream(scores).maxIndex().getAsInt();
//		a = scores[scores.length-1];
		return maxIndex;
	}
	
	public static int lowIndex(int[] scores) {
		int min = scores[0];
		int minIndex = 0;
		
		for(int i=0; i<scores.length; i++) {
			if(scores[i]<min) {
				min = scores[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
