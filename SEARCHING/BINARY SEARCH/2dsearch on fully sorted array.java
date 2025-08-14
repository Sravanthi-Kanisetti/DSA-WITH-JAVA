
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int nums[][]={{1,2,3},
	                  {4,5,6},
	                  {7,8,9}
	                 };
	   int target=6;
	   System.out.println(Arrays.toString(twodsearch(nums,target)));
		
	}
	
	
	
	//search in the specified row between the columnss provided
	static int[] binarysearch(int[][] nums,int row,int cstart,int cend,int target){
	    while(cstart<=cend){
	        int mid=cstart+(cend-cstart)/2;
	        if(nums[row][mid]==target){
	            return new int[]{row,mid};
	        }
	        if(nums[row][mid]>target){
	            cend=mid-1;
	        }
	        else{
	            cstart=mid+1;
	        }
	    }
	    return new int[]{-1,-1};
	}
	
	
	
	static int[] twodsearch(int[][] nums,int target){
	    int rows=nums.length;
	    int cols=nums[0].length;
	    int rstart=0;
	    int rend=rows-1;
	    int cmid=cols/2;
	    if(rows==1){
	        return binarysearch(nums,0,0,cols-1,target);
	    }
	    
	    
	    //run the looop till 2 rows are remaining 
	    while(rstart<(rend-1)){//while this is true it will have more than 2 rows 
	        int mid=rstart+(rend-rstart)/2;
	        if(nums[mid][cmid]==target){
	            return new int[]{mid,cmid};
	        }
	        if(nums[mid][cmid]<target){
	            rstart=mid;//here we are not doing mid+1 bcoz who know whether ou element is present in that row or not
	        }
	        else{
	            rend=mid;
	        }
	        
	    }
	    
	    
	    //now we have two rows 
	    //check whether the target is in middle column or not of the final two rows 
	    if(nums[rstart][cmid]==target){
	        return new int[]{rstart,cmid};
	    }
	    if(nums[rstart+1][cmid]==target){
	        return new int[]{rstart+1,cmid};
	    }
	    
	    //search in 1st part
	    if(target<=nums[rstart][cmid-1]){
	        return binarysearch(nums,rstart,0,cmid-1,target);
	    }
	    //search in 2nd part
	     if(target>=nums[rstart][cmid+1]  && target<=nums[rstart][cols-1]){
	        return binarysearch(nums,rstart,cmid+1,cols-1,target);
	    }
	    //search in 3rd part
	     if(target<=nums[rstart+1][cmid-1]){
	        return binarysearch(nums,rstart+1,0,cmid-1,target);
	    }
	    //search in 4th part
	     else{
	        return binarysearch(nums,rstart+1,cmid+1,cols-1,target);
	    }
	    
	}
	
	
	
}
