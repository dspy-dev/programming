package com.samsung.test;

public class leetCode {

	
	public int numJewelsInStones(String J, String S) {
	     int cnt = 0;
	     int jLen = J.length();
	     int sLen = S.length();
	     
	     for(int i =0; i <jLen; i++){
	    	 char c=J.charAt(i);
	    	 for(int j=0; j <sLen; j++){
	    		 if(S.charAt(j) == c){
	    			 cnt++;
	    		 }
	    	 }
	     }
	     
		return cnt;
	    }
	public boolean isCapital(char c) {
		boolean val =  false;
		
		if(( c >= 65) && (c <= 90)) val = true;
		
		return val;
	}
	public boolean isSmall(char c) {
		boolean val =  false;
		
		if(( c >= 97) && (c <= 122)) val = true;
		
		return val;
	}	
    public boolean detectCapitalUse(String word) {
        boolean firstCharSmall = false;
        boolean firstCharCap = false;
        boolean allSmall = false;
        boolean allCaps = false;
        int wLen = word.length();
        if (wLen == 1) return true;
        if (wLen == 0) return false;
        
        for(int i=0; i< wLen; i++){
        	char c = word.charAt(i);
        	if(i == 0){
        		if(isSmall(c)) firstCharSmall = true;
        		if(isCapital(c)) firstCharCap = true;
        		continue;
        	}
        	if(firstCharSmall){
        		//Case for all small ex: 'leetcode"
        		if(isCapital(c)) return false;
        		else if(isSmall(c)){
        			allSmall = true;
        			continue;
        		}
        	}
        	if(firstCharCap){
        		//Need to handle 2 cases
        		// Case 1: all caps
        		// Case 2: First caps rest all Small
        		if(isSmall(c)){
        			allSmall = true;
        			if(allCaps)
        				return false;
        			continue;
        		}else if(isCapital(c)){
        			if(allSmall)
        				return false;
        			allCaps = true;
        			
        		}
        		
        	}
        }
        if( firstCharSmall && allSmall){
        	return true;
        }
        if( firstCharCap ){
        	if(allSmall)
        		return true;
        	else if(allCaps)
        		return true;
        }
           
        return false;
    }
    public int eventNumCount(int[] A) {
    	int cnt = 0;
    	for(int i=0, j=0, k=0; i < A.length; i++, j++, k++){
    		if(A[i]%2 == 0){
    			cnt++;
    		}
    	}
    	return cnt;
    }
    public int[] sortArrayByParity(int[] A) {
    	int Alen = A.length;
    	int evenCnt = eventNumCount(A);
    	int oddCnt = Alen - evenCnt;
    	int []myEvenArray = new int[evenCnt];
    	int []myOddArray = new int[oddCnt];
    	for(int i=0, j=0, k=0; i<Alen; i++){
    		if(A[i]%2 == 0){
    			myEvenArray[j] = A[i];
    			j++;
    		}
    		else{
    			myOddArray[k] = A[i];
    			k++;
    		}
    	}
    	int []finalArray = new int[Alen];
    	for(int i=0, j=0; i<evenCnt;j++, i++)
    		finalArray[i] = myEvenArray[j];
    	
    	for(int i=evenCnt, j=0; i<Alen; i++,j++)
    		finalArray[i] = myOddArray[j];
    	
    	return finalArray;
        
    }
    public int nOfWays(String str){
		
		if(str.length() == 1) return 1;
		
		int ways = nOfWays(str.substring(1));
		if(str.length() > 2 && checkValidity(str.substring(0,2))) {
			
			ways += nOfWays(str.substring(2));
		}
		return ways;
		
	}
	
	public boolean checkValidity(String str) { // assume that you get 2digits only
		int temp = Integer.valueOf(str).intValue();
		if (temp > 26)
			return false;
		return true;
	}
	
	public int febonacci(int n){
		
		if(n<=0) return 1;
		
		return febonacci(n-1)+ febonacci(n-2);
		
	}
	
	public static void main( String arg[]){
		leetCode lc = new leetCode();
		//int jewelCnt = lc.numJewelsInStones("aA", "aAAbbbb");
		//System.out.println("jewel count = " +jewelCnt);
		
		//boolean capitalUsageProper = lc.detectCapitalUse("oRange");
		//System.out.println("Capital Usage Proper:oRange ?" +lc.detectCapitalUse("oRange"));
		//System.out.println("Capital Usage Proper: USA ?" +lc.detectCapitalUse("USA"));
		//System.out.println("Capital Usage Proper: FFFFFFFFFFFFFFFFFFFFf ?" +lc.detectCapitalUse("FFFFFFFFFFFFFFFFFFFFf"));
		//System.out.println("Capital Usage Proper: ffffffffffffffffffffF ?" +lc.detectCapitalUse("ffffffffffffffffffffF"));
		//System.out.println("Capital Usage Proper:leetcode ?" +lc.detectCapitalUse("leetcode"));
		//System.out.println("Capital Usage Proper:FlaG ?" +lc.detectCapitalUse("FlaG"));
		
		//int []A = {3,1,2,4};
		//int []finalArray =lc.sortArrayByParity(A);
		
/*		
		int ways = lc.nOfWays("1234");
		System.out.println("ways :"+ways);
*/
		int n = 5;
		System.out.println("febonacci series for: "+n + " is " + lc.febonacci(n));
		
	}
}


