
public class Main
{
	public static void main(String[] args) {
		int[] nums={3,5,1};
		int target=3;
		System.out.println(search(nums,target,0,nums.length-1));
	
	}
	
	
        	static  int search(int[] nums,int target,int start,int end){
        	    int pivot=findPivot(nums);
        	    System.out.println(pivot);
        	    if(pivot==-1){
        	        return binarySearch(nums,target,start,end);
        	    }
        	    if(nums[pivot]==target){
        	        return pivot;
        	    }
        	    if(target>=nums[start]){
        	        return binarySearch(nums,target,start,pivot);
        	    }
        	    else{
        	        return binarySearch(nums,target,pivot+1,end);
        	    }
        	}
	    
	
	
  static int findPivot(int[] nums){
      int start=0;
      int  end=nums.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(mid<end && nums[mid]>nums[mid+1] ){
              return mid;
          }
          if( mid>start && nums[mid]<nums[mid-1] ){
              return mid-1;
          }
          if(nums[start]<nums[mid]){
              start=mid+1;
          }
          else{
              end=mid-1;
          }
      }
      return -1;
  }	
  
  
  
  
              
              static int binarySearch(int[] nums,int target,int start,int end){
                        	    while(start<=end){
                        	        int mid=start+(end-start)/2;
                        	        
                        	        if(target>nums[mid]){
                        	            start=mid+1;
                        	        }
                        	        else if(target<nums[mid]){
                        	            end=mid-1;
                        	        }
                        	        else{
                        	            return mid;
                        	        }
                        	    }
            	    return -1;
                      
                  }
  }
