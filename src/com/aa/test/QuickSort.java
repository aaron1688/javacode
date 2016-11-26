package com.aa.test;

public class QuickSort {

    static void sort(int[] A){
    	if(A == null || A.length ==0) return;
    	quickSort(A, 0, A.length-1);
    }
    
    static void quickSort(int[]A, int low, int high){
    	
    }
    
	public static void main(String[] args) {
		int[] A = {24,2,45,20,56,75,2,56,99,53,12};
		print(A);
		System.out.println();
        sort(A);
        print(A);
	}
	
	static void swap(int[]A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
	static void print(int[] A){
		for(int a:A){
			System.out.print(a + ",");
		}
		System.out.println();
	}
	
	   static void quickSort1(int[]A, int low, int high){
	    	int i = low;
	    	int j = high;
	    	int pivot = A[low + (high - low)/2];
	    	
	    	while(i <= j){
	    		while(A[i] < pivot) i++;
	    		while(A[j] > pivot) j--;
	    		if(i <= j){
	    			swap(A, i, j);
	    			i++;
	    			j--;
	    		}
	    	}
	    	print(A);
	    	if(low < j) quickSort1(A,low,j);
	    	if(i < high) quickSort1(A,i,high);
	    }

}
