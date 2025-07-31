

public class searchinrange{
    public static void main(String[] args){
        int[] nums={-2,10,-5,23,89,55,110,49,76,20};
        int target=5509;
        int start=1;
        int end=7;
        boolean result=search(nums,target,start,end);
        System.out.println("the element within in a given range is found "+result);
    }
    
    
    static boolean search(int[] nums,int target,int start,int end){
        for(int i=start;i<end;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}
