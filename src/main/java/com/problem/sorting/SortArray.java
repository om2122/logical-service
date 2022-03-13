package com.problem.sorting;

public class SortArray {

	public static void sortArray(int[] arr) {
		
		int temp;
		int a = 0;
		int b = arr.length-1;
        
        while (a < b)
        {
            temp = arr[a];
            arr[a] = arr[b];
            arr[a] = temp;
            a++;
            b--;
        }
	}
	
	public static void main(String[] args) {
		
		int[] a = {3,2,52,1,5,7};
		sortArray(a);
		for (int i = 0; i < a.length-1; i++)
			System.out.print(a[i] + " ");
	}

}
