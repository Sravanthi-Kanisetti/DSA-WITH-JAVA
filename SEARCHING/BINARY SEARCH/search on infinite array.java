

public class Main{
    public static void main(String[] args){
        int[] nums={1,3,4,7,8,17,19,23,26,28,37,55,56,66};
        int target=37;
        System.out.println("the target is at index  "+measure(nums,target));
        
    }
    
    static int measure(int[] nums,int target){
        int start=0;
        int end=1;
        
        while(target>nums[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        
        return binarysearch(nums,target,start,end);
    }
    
    
    static int  binarysearch(int[] nums,int target,int start,int end){
        while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(target>nums[mid]){
            start=mid+1;
        }
        if(target<nums[mid]){
            end=mid-1;
        }
        
        }
        return -1;
    }
}









