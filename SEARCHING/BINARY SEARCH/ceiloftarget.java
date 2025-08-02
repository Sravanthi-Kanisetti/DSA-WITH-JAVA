
public class Main
{
	public static void main(String[] args) {
		int[] nums={2,3,5,9,14,16,18};
		int target=17;
		int floora=floor(nums,target);
		int ceila=ceil(nums,target);
		System.out.println("the ceil of in the given array is "+ceila);
		System.out.println("the floor of in the given array is "+floora);
	}
	
	
	static int floor(int[] nums,int target){
	    int start=0;
	    int end=nums.length-1;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(nums[mid]==target){
	            return nums[mid];
	        }
	        if(target<nums[mid]){
	            end=mid-1;
	        }
	        if(target>nums[mid]){
	            start=mid+1;
	        }
	    }
	    return nums[end];
	}
	
	
	static int ceil(int[] nums,int target){
	    int start=0;
	    int end=nums.length-1;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(nums[mid]==target){
	            return nums[mid];
	        }
	        if(target<nums[mid]){
	            end=mid-1;
	        }
	        if(target>nums[mid]){
	            start=mid+1;
	        }
	    }
	    return nums[start];
	}
}
