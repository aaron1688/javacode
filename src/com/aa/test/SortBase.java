package com.aa.test;

public class SortBase {
	static void swap(int[] input, int i , int j){
		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}
    static void printNumbers(int[] input) {
        
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
}
