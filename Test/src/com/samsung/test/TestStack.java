package com.samsung.test;

public class TestStack {
	int arr[];
	int top;
	TestStack(int n){
		arr = new int[n];
		top = -1;
		
	}
	void push(int a){
	if(top < arr.length -1 ){ 
		top++;
		arr[top] = a;
	}else {
		System.out.println("Arrrey Yentra babu...... Array out of bounds");
	}

	}
	int pop(){
		int num = 0;
		if(top == -1) return -1;
		else {
			num = arr[top];
			top--;
		}
		return num;
	}
	public static void main(String []args){
		int size = 2;
		TestStack ts = new TestStack(size);
		ts.push(5);
		ts.push(10);
		ts.push(18);
		ts.push(19);
		ts.push(20);
		ts.push(21);
		ts.push(2);
		ts.push(19);
		ts.push(20);
		ts.push(21);
		ts.push(2);
		ts.push(10);
		ts.push(18);
		ts.push(19);
		ts.push(20);
		ts.push(21);
		ts.push(2);
		ts.push(19);
		ts.push(20);
		ts.push(21);
		ts.push(2);
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
		System.out.println("top element is :    "+ts.pop());
	}

}
