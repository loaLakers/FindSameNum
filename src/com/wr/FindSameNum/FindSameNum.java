package com.wr.FindSameNum;

public class FindSameNum {
	
	public static void main(String[] args){
		
		int[] myInput = {1,2,3,4,5,32,5,15,14,2};
		Count(myInput);
	}
	
	public static void Count(int[] input){
		
		int[] mySet = new int[33];
		
		for(int i = 0; i < input.length; i++ ){
			
			for(int j = 0; j <= 32; j++){
				
				if(input[i] == j){
					
					mySet[j]++;
				}
			}
		}
		
		for(int i = 0; i <= 32; i ++){
			
			if(mySet[i] >= 2){
				
				System.out.println(i);
			}
		}
		
	}
}
