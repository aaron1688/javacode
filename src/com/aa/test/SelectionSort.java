package com.aa.test;

public class SelectionSort extends SortBase{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = {26, 8, 9, -6, 23, -12, 34, 0, 1};
		printNumbers(A);
		selectionSort(A);
		printNumbers(A);
	}
	
	private static void selectionSort(int[] A){
		for(int i=A.length-1;i>=0; i--){
			int max = i;
			for(int j = 0;j < i; j++){
				if(A[max]<A[j]){
					int tmp = max;
					max = j;
					j = tmp;
				}
			}
			if(max != i)
			swap(A,max,i);
		}
	}
	
	private static void selectionSortMin(int[] A){
		for(int i=0; i<A.length-1;i++){
			int min = i;
			for(int j = i+1;j < A.length; j++){
				if(A[min]>A[j]){
					int tmp = min;
					min = j;
					j = tmp;
				}
			}
			if(min != i)
			swap(A,min,i);
		}
	}

}
