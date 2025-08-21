
public class Main
{
	public static void main(String[] args) {
	int[] nums={4,3,7,8,2,3,1,4};
	int resa=solutions(nums);
	System.out.println(resa);
	}
	
	
	static int solutions(int[] nums){
	    int i=0;
	    while(i<nums.length){
	        if(nums[i]!=i+1){
	            int check=nums[i]-1;
	            if(nums[i]!=nums[check]){
	                swap(nums,i,check);
	            }
	            else{
	                return nums[i];
	            }
	        }
	        else{
	            i++;
	        }
	    }
	    return -1;
	}
	
	static void swap(int[] nums,int start,int end){
	    int temp=nums[start];
	    nums[start]=nums[end];
	    nums[end]=temp;
	}
}
