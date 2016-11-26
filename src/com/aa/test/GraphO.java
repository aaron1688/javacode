package com.aa.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class GraphO {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] T = new int[10];
		T[0] = 9;
		T[1] = 1;
		T[2] = 4;
		T[3] = 9;
		T[4] = 0;
		T[5] = 4;
		T[6] = 8;
		T[7] = 9;
		T[8] = 0;
		T[9] = 1;

		solution(T);
	}
	
	public static void solution(int[] T){
		int root = 0;
		LinkedList<Integer>[] adj;
		adj = new LinkedList[T.length];
		for (int i=0; i < T.length; i++){
			if(T[i] == i) root = i;
			adj[i] = new LinkedList<Integer>();
		}
		for (int i=0; i < T.length; i++){
			if(T[i] != i) adj[T[i]].add(i);
		}		
		printAdj(adj);
		int[] dist = new int[T.length];
		listCenterEdges(adj,root,1,dist);
		System.out.println(Arrays.toString(dist));
		
	}
	
	static void listCenterEdges(LinkedList<Integer> adj[], int root, int distance, int[] levels){
		LinkedList<Integer> rootList = adj[root];
		for(Integer child : rootList){
			levels[distance]++;
			listCenterEdges(adj,child,distance+1,levels);
		}
	}
	
	static void printAdj(LinkedList<Integer> adj[]){
		for(LinkedList<Integer> ele:adj){
			System.out.println(ele);
		}
		
	}
	
	static void getEdges(int root, int[] T){
		
		for (int i=0; i < T.length; i++){
			if(T[i] == i) root = i;
		}
	}
	
	public static int getFirstDigit(int x){
	    while (x > 9) {
	        x /= 10;
	    }
	    return x;
	}
	
	static class MyNode{
		int root;
		ArrayList children;
		public MyNode(int root){
			this.root = root;
			children = new ArrayList();
		}
		void insertChild(int child){
		   children.add(child);
		}
		
		
	}

}
