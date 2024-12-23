package algorithm.sort.selectionSort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		System.out.println("===brfore===");
		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length - 1; i++) {
			// 최솟값 인덱스 설정
			int minIdx = i;

			// 배열을 탐색하며 가장 작은값 검색
			for (int j = i + 1; j < arr.length; j++) {
				minIdx = arr[minIdx] > arr[j] ? j : minIdx;
			}

			// 탐색 완료하면 가장 작은 값을 가장 앞의 원소와 치환
			int tmp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = tmp;
		}

		System.out.println("===after===");
		System.out.println(Arrays.toString(arr));
	}
}
