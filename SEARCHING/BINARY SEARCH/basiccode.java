
import java.util.*;
public class BinarySearch
{
	public static void main(String[] args) {
	   int[] arr={1,21,35,47,59,62,73,84,95,101};
	   int target=59;
	   int result=binarysearch(arr,target);
	   System.out.println("element is at inex  "+result);
	}
	
	
	
	static int binarysearch(int[] arr,int target){
	    int start=0;
	    int end=arr.length-1;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        
	        if(target>arr[mid]){
	            start=mid+1;
	        }
	        else if(target<arr[mid]){
	            end=mid-1;
	        }
	        else{
	            return mid;
	        }
	    }
	    return -1;
	 
	}
}
