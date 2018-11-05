package com.samsung.test;

public class TestQueue {
	int []arr;
	int size;
	TestQueue(int n){
		arr = new int[n];
		size = 0;
	}
	void add(int n){
		if(size < arr.length){
			arr[size] = n;
			size++;
		}
		
	}
	int delete(){
		int num =0;
		num = arr[0];
		for(int i =0, j=1; (i < size)&&(j<size); i++, j++){
			arr[i]=arr[j];
		}
		System.out.println("Cheepesh  ...."+arr[0]);
		if(size > -1)
			size--;
		else
			return -1;
		
		return num;
	}
	public void display(){
		System.out.println("displaying queue elements");
		for(int i = 0; i<size; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String []args){
		TestQueue tq = new TestQueue(5);
		tq.add(1);
		tq.add(2);
		tq.add(3);
		tq.add(4);
		tq.add(5);
		/*		tq.add(6);
*/		tq.display();
		System.out.println("deletion: \n "+tq.delete());
		System.out.println("deletion: \n "+tq.delete());
		System.out.println("deletion: \n "+tq.delete());
		System.out.println("deletion: \n "+tq.delete());
		System.out.println("deletion: \n "+tq.delete());
		System.out.println("deletion: \n "+tq.delete());
		tq.display();
	}
}

