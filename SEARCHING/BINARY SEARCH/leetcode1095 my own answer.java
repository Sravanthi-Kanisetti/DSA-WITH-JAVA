//in this we need to find the target element index value array is given as mounatin array //
//means increase elements and then decrease elements we nneed to find our targeted value in the first increaseing block and then we find to find our targeted element in decrease block of elements also 
//if ou target element is not in increased part we need to go and search for decreased block to search for our targeted element 
//if we not found our element in both increased and decreased blocks then return -1


public class Main{
    public static void main(String [] args){
       int[] nums={0,1,7,9,2,1};
       int target=7;
       int peak=peakIndexInMountainArray(nums);
       int fira=-1;
       fira=binarysearch(nums,target,0,peak,true);
       if(fira==-1){
           fira=binarysearch(nums,target,peak,nums.length-1,false);
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
    
    
    static int binarysearch(int[] nums,int target,int start,int end,boolean order){
        while(start<=end){
            int mid=start+(end-start)/2;
                     if(nums[mid]==target){
                                    return mid;
                    }
                    
            if(order){
                        if(nums[mid]>target){
                            end=mid-1;
                        }
                        else{
                            start=mid+1;
                        }
                
            }
            else{
                if(nums[mid]>target){
                            start=mid+1;
                 }
                  else{
                            end=mid-1;
                }
                
            }
                
        }
        return -1;
    }
        
    
}
