package com.java.practise;

public class SelectionSort {
	
	void sSort(int []A, int n){
		int i, j, min, temp;
		for(i = 0; i < n-1; i++){
			min = i;
			for(j = i+1; j < n; j++){
			if(A[j] < A[min])
				min = j;
			}
			temp = A[min];
			A[min] = A[i];
			A[i] = temp;
		}
	}
	void display(int []A){
		for(int i = 0; i <A.length; i++){
			System.out.println(A[i]);
		}
	}
	public static void main(String []args){
		
		SelectionSort ss = new SelectionSort();
		int A[] = {8, 9, 76, 1,2,4,77, 3,5, 6 };
		System.out.println("Before Sorted...");
		ss.display(A);
		ss.sSort(A, 10);
		System.out.println("After Sorted...");
		ss.display(A);
	}
	

}
