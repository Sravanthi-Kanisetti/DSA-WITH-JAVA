
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] nums={2,4,6,5,3,1};
		cyclesort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	static void cyclesort(int[] nums){
	    int i=0;
	    while(i<nums.length){
	        int check=nums[i]-1;
	        if(nums[i]!=nums[check]){
	            swap(nums,i,check);
	        }
	        else{
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
