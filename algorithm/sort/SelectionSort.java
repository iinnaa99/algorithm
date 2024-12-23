package algorithm.sort;

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
			// �ּڰ� �ε��� ����
			int minIdx = i;

			// �迭�� Ž���ϸ� ���� ������ �˻�
			for (int j = i + 1; j < arr.length; j++) {
				minIdx = arr[minIdx] > arr[j] ? j : minIdx;
			}

			// Ž�� �Ϸ��ϸ� ���� ���� ���� ���� ���� ���ҿ� ġȯ
			int tmp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = tmp;
		}

		System.out.println("===after===");
		System.out.println(Arrays.toString(arr));
	}
}
