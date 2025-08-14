//this is row wise sorted and col wise sorted but not entire matrix is sorted for checking just write it in 1d array u can understand
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[][] nums={
		    {1,2,3,4,5},
		    {6,7,8,9,10},
		    {11,12,13,14,15},
		    {16,17,18,19,20},
		    {26,27,28,29,30}
		};
		int target=17;
		System.out.println(Arrays.toString(search(nums,target)));
		System.out.println("length is=>"+nums.length);
	}
	static int[] search(int[][] nums,int target){
	    int r=0;
	    int c=nums.length-1;
	    while(c>=0 && r<nums.length){
	        if(nums[r][c]==target){
	            return new int[]{r,c};
	        }
	        if(nums[r][c]<target){
	            r++;
	        }
	        else{
	            c++;
	        }
	    }
	    
	    
	  return new int[]{-1,-1};
	    
	}
}
