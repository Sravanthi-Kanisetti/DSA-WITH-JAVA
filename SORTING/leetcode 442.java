

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] nums={4,3,2,7,7,7,8,2,3,1,4};
		cyclesort(nums);

		List<Integer> ans=new ArrayList<>();
		
	    for(int index=0;index<nums.length;index++){
	        if(nums[index]!=index+1){
	            ans.add(nums[index]);
	        }
	    }
	    
	    System.out.println(ans);
	}
	
	
	static void cyclesort(int[] nums){
	    int i=0;
	    while(i<nums.length){
	        int check=nums[i]-1;
	        if(nums[i]!=nums[check]){
	            swap(nums,i,check);
	        }else{
	            i++;
	        }
	    }
	}
	
	
	static void swap(int[] nums,int start,int end){
	    int temp=nums[start];
	    nums[start]=nums[end];
	    nums[end]=temp;
	}
}
