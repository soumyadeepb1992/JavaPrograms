package com.java.programs;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		 int arr[] = {10,20,20,30,30,40,50,50};  
	        int length = arr.length;  
	        length = removeDuplicateElements(arr, length);  
	        //printing array elements  
	        for (int i=0; i<length; i++)  
	           System.out.print(arr[i]+" ");  
	    

}
	
	public static int removeDuplicateElements(int arr[], int n){
	    if (n == 0 || n == 1) {
	        return n;
	    }
	    Arrays.sort(arr);  
	    int[] temp = new int[n];
	    int i = 0, j = 0;
	    temp[j++] = arr[i++];
	    for ( ; i < n - 1; i++) {
	        if (arr[i] != arr[i-1]) {
	            temp[j++] = arr[i];
	        }
	    }
	    for (i = 0; i < j; i++) {
	        arr[i] = temp[i];
	    }
	    return j;
	}
}
