
public class orderbinarysearch
{
	public static void main(String[] args) {
		int[] nums={11,22,33,44,55,66,77,88,99};
		int target=77;
		boolean result=ordersearch(nums,target);
		System.out.println("the element is found is "+result);
		
	}
	
	
	static boolean ordersearch(int[] nums,int target){
	    int start=0;
	    int end=nums.length-1;
	    boolean asc=nums[0]<nums[nums.length-1];
	   

	    if (asc==true){
	        while(start<=end){
	            int mid=start+(end-start)/2;
	            if(target>nums[mid]){
	                start=mid+1;
	            }
	            if(target<nums[mid]){
	                end=mid-1;
	            }
	            if(target==nums[mid]){
	                System.out.println("heyy the order is Asccending");
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    if (asc==false){
	        
	         while(start<=end){
	            int mid=start+(end-start)/2;
	            if(target>nums[mid]){
	                end=mid-1;
	                
	            }
	            if(target<nums[mid]){
	                 start=mid+1;
	                
	            }
	            if(target==nums[mid]){
	                System.out.println("heyy the order is descending");
	                return true;
	            }
	            
               
	        }
	        return false;
	    }
	    
	    return false;
	}
}










































public class orderbinarysearch
{
	public static void main(String[] args) {
		int[] nums={11,22,33,44,55,66,77,88,99};
		int target=7349;
		boolean result=ordersearch(nums,target);
		System.out.println("the element is found is "+result);
		
	}
	
	
	static boolean ordersearch(int[] nums,int target){
	    int start=0;
	    int end=nums.length-1;
	    boolean asc=nums[0]<nums[nums.length-1];
	    
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(nums[mid]==target){
	            return true;
	        }
	        
	        if(asc==true){
	              if(target>nums[mid]){
	                start=mid+1;
	            }
	            if(target<nums[mid]){
	                end=mid-1;
	            }
	       }
	        
	        
	        else{
	               if(target>nums[mid]){
	                end=mid-1;
	            }
	            if(target<nums[mid]){
	                 start=mid+1;
	            }
	            
	           }
	
	    }

	    return false;
	}
}
