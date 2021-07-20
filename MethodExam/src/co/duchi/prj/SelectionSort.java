package co.duchi.prj;

public class SelectionSort {
	private int[] arr = { 5, 2, 4, 1, 3 };

	public void selectSort() {
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // ascending sort 오름차순 정렬
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int n : arr) {
			System.out.print(n + " : ");
		}

	}

	public void selectSort2() {
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}
			if (min != i) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		for(int n : arr) {
			System.out.println(n + " : ");
		}
 	}
}
