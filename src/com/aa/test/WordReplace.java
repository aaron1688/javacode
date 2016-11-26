package com.aa.test;

public class WordReplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int N = 240;
		solution(N);
	}
    static void solution(int N){
    	if(N<1 || N >1000) return;
    	StringBuilder sb = new StringBuilder();
    	for(int i =1; i<N+1; i++){
    		boolean converted = false;
    		if(i%3 == 0){
    			sb.append("Fizz");
    			converted = true;
    		}
    		if(i%5 == 0){
    			sb.append("Buzz");
    			converted = true;
    		}
    		if(i%7 == 0){
    			sb.append("Woof");
    			converted = true;
    		}
    		if(!converted) sb.append(i);
    		sb.append("\n");
    	}
    	System.out.println(sb.toString());
    }
}
