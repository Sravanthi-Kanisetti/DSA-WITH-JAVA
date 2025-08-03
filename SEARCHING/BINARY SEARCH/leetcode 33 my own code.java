
public class Main{
    public static void main(String [] args){
       int[] nums={4,5,6,7,0,1,2};
       int target=3;
       int peak=peakIndexInMountainArray(nums);
       int fira=-1;
       if (nums[0]<=target && target<=nums[peak]){
           fira=binarysearch(nums,target,0,peak);
       }
       else{
           fira=binarysearch(nums,target,peak,nums.length-1,);
       }
       
       System.out.println("the target is at index "+fira);
       
    }
    
    
       static int peakIndexInMountainArray(int[] nums) {
           int start=0;
           int end=nums.length-1;
           while(start<end){
               int mid=start+(end-start)/2;
               if(nums[mid]>nums[mid+1]){
                   end=mid;
               }
               else{
                   start=mid+1;
               }
           }
           return start;
    }
    
    
      
    static int binarysearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
                     if(nums[mid]==target){
                                   return mid;
                    }
                        if(nums[mid]>target){
                            end=mid-1;
                        }
                        else{
                            start=mid+1;
                        }
            }
        return -1;
    }
      
        
    
}
