package com.aa.test;

public class NDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       int[] A = {8,24,3,20,1,17};
       int[] B = {7,21,3,42,3,7};
       solution(A);
       solution(B);
	}
	
	static void solution(int[] A){
		int smallest = 0;
		
		for(int i=0;i<A.length-1;i++){
			for(int j=i+1;j<A.length-1;j++){
				int dist = Math.abs(A[i]-A[j]);
				if(i ==0) smallest = dist;
				else { 
					if(smallest > dist) smallest = dist;
				}
			}
		}
		System.out.println(smallest);
	}
}
