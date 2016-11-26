package com.aa.test;
import java.util.Arrays;
public class BubbleSort extends SortBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] input = { 26, 8, 23, 6, -23, 12, 34, 0, 1 };
		printNumbers(input);
		bubblesort(input);
		printNumbers(input);
	}
	
	public static void bubblesort(int[] input){
		int n = input.length;
		int k;
		int count = 0;
		//while(count < n){
		for(int j = 0; j < n-1;j++){
			for(int i = 0; i < n-1;i++){
				k = i+1;
				if(input[i] > input[k]){
					swap(input, i, k);
				}
			}
			//count++;
			printNumbers(input);
		}
		
	}
	
}
