import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] nums={9,-2,7,23,11,-198,15,-74};
		selection(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	
	static void selection(int[] nums){
	    for(int i=0;i<nums.length;i++){
	        int last=nums.length-i-1;
	        int max=getmax(nums,0,last);
	        swap(nums,max,last);
	    }
	}
	
	
	static void swap(int[] nums,int first,int second){
	    int temp=nums[first];
	    nums[first]=nums[second];
	    nums[second]=temp;
	}
	static int getmax(int[] nums,int start,int end){
	    int mada=start;
	    for(int j=start;j<=end;j++){
	        if(nums[j]>nums[mada]){
	            mada=j;
	        }
	    }
	    return mada;
	}
}
