package com.samsung.test;
import java.util.ArrayList;
import java.util.List;

public class HideSeek {

	public int[][] findAllPaths(int [][]path){
		int [][]paths= new int[9][9];
		

		int i = 0;
		int j = 0;
		//ArrayList<ArrayList<Integer>> list = new ArrayList<Integer>(path.length);
		List<List<Integer>> arrList = new ArrayList<List<Integer>>(path.length);
		//List<Integer> list = new ArrayList<>();

		
		int root = 1;
		
		//list.add(root);

		while(i < path.length){
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(root);
			while(i < path.length ){
		
				if(path[i][0] == list.get(list.size() - 1 )){
					if(path.length == (i - 1))// reached end of array with that path
						break;
					list.add(path[i][1]);
				}
				
				i++;

			}
			i = 0;
			arrList.add(j, list);
			j++;
			
		}
/*		for(int l=0; l<arrList.size(); l++){
			for(int k=0; k < arrList.get(l).list.size(); k++){
				System.out.println(list.get(k));
			}
		}*/
		
		return path;
	}
	public boolean findPossibility(int [][]path, int [][]query){
		boolean possible = false;
		
		int [][]allPaths = findAllPaths(path);
		
		return possible;
	}
	
	public static void main(String []args){
		int [][]path = {
						{1, 2},
						{1, 3},
						{2, 6},
						{2, 7},
						{6, 9},
						{7, 8},
						{3, 4},
						{3, 5}
					};
		int [][]query ={
					{0, 2, 8},
					{1, 2, 8},
					{1, 6, 5},
					{0, 6, 5},
					{1, 9, 1}
				};
		
		HideSeek hs = new HideSeek();
		hs.findAllPaths(path);
		boolean possible = hs.findPossibility(path, query);
		
		
	}
	
}
