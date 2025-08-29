package main;

import java.util.Comparator;

public class InsertionSort implements Sort {
	private int[] insertionSort(int[] arr, Comparator<Integer> cmp) {
		int[] res = arr.clone();
		int n = res.length;
		for (int i = 0; i < n; i++)
	    {
	        int x = res[i];
	        int pos = i - 1;
	        while (pos >= 0 && cmp.compare(x, res[pos]) < 0)
	        {
	        	res[pos + 1] = res[pos];
	            pos--;
	        }
	        res[pos + 1] = x;
	    }
		return res;
	}
	public int[] sortAscending(int[] arr) {
		return insertionSort(arr, Comparator.naturalOrder());
	}
	public int[] sortDescending(int[] arr) {
		return insertionSort(arr, Comparator.reverseOrder());
	}
}
