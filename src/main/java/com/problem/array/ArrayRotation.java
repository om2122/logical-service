package com.problem.array;

public class ArrayRotation {

	public void leftRotate(int arr[], int d, int n) {

		d = d % n;
		int i, j, k, temp;
		int g_c_d = gcd(d, n);
		for (i = 0; i < g_c_d; i++) {
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
	}

	public void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	public static void main(String[] args) {
		ArrayRotation rotate = new ArrayRotation();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.printArray(arr, 7);
		System.out.println();
		rotate.leftRotate(arr, 2, 7);
		rotate.printArray(arr, 7);
	}

}
