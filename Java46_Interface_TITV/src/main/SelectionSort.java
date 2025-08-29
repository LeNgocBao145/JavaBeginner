package main;

import java.util.Comparator;

public class SelectionSort implements Sort {
	private int[] selectionSort(int[] arr, Comparator<Integer> cmp) {
		int[] res = arr.clone();
		int n = res.length;
		 for (int i = 0; i < n; i++) {
			 int index = i;
		        for (int j = i + 1; j < n; j++)
		        {
		            if (cmp.compare(res[index], res[j]) > 0)
		            {
		                index = j;
		            }
		        }
		        
		        int tmp = res[i];
		        res[i] = res[index];
		        res[index] = tmp;
		    }
		 return res;
	}
	public int[] sortAscending(int[] arr) {
		return selectionSort(arr, Comparator.naturalOrder());
	}
	public int[] sortDescending(int[] arr) {
		return selectionSort(arr, Comparator.reverseOrder());
	}
}
