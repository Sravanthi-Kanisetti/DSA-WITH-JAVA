
import java.util.*;
public class Main{
    	public static void main(String[] args){
    	    int[] nums={1,2,0};
    	    int resa=missingpos(nums);
    	    System.out.println(resa);
    	    System.out.println(Arrays.toString(nums));
    	}
    	
    	static int missingpos(int[] nums){
    	    int i=0;
    	    while(i<nums.length){
    	        int check=nums[i]-1;
    	        if(nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[check]){
    	            swap(nums,i,check);
    	        }
    	        else{
    	            i++;
    	        }
    	    }
    	    
    	    
    	    for(int ind=0;ind<nums.length;ind++){
    	        if(nums[ind]!=ind+1){
    	            return ind+1;
    	        }
    	    }
    	    
    	    return nums.length+1;
    	}
    	
    		static void swap(int[] nums,int start,int end){
	    int temp=nums[start];
	    nums[start]=nums[end];
	    nums[end]=temp;
	}
}
