
public class Main
{
	public static void main(String[] args) {
		int[] nums={4,4,4,5,5,5,6,6,7,7,7,7,8,8,8,8,11,0,0,0,1,1,1,1,2,2,3,3,3,3,4};
		int target=3;
		int ans=findPivotwithDuplicates(nums);
		System.out.println("the answer is"+nums[ans]);
	//	System.out.println(search(nums,target,0,nums.length-1));
	
	}
	
	
        	static  int search(int[] nums,int target,int start,int end){
        	    int pivot=findPivotwithDuplicates(nums);
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
	    
	
	
  static int findPivotwithDuplicates(int[] nums){
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
          if(nums[mid]==nums[start]  && nums[mid]==nums[end]){
              if(nums[start]>nums[start+1]){
                  return start;
              }
              start++;
             if(nums[end]<nums[end-1]){
                 return end-1;
             }
             end--;
          }
          else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
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
