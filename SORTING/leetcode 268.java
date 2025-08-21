
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] nums={0,2,4,6,8,1,3,5,7,9};
		int resa=cyclesort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(resa);
	}
	
	static int cyclesort(int[] nums){
	    int i=0;
	    while(i<nums.length){
	        int check=nums[i];
	        if(nums[i]<nums.length && nums[i]!=nums[check]){
	            swap(nums,i,check);
	        }
	        else{
	            i++;
	        }
	    }
	    
	    
	    
	    for(int ind=0;ind<nums.length;ind++){
	        if(nums[ind]!=ind){
	            return ind;
	        }
	    }//if all index=nums[index] then the missing value is the last eleemnt of the range which is length of array thats why we returh nums.length
	    return nums.length;
	}
	
	static void swap(int[] nums,int start,int end){
	
	 int temp=nums[start];
	 nums[start]=nums[end];
	 nums[end]=temp;

	    
	}
	
}
