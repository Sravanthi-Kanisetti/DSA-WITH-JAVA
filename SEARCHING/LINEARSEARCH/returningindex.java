
public class returningindex{
    public static void main(String[] args){
      int[] nums={11,22,33,44,55,66,77,88,99};
      int target=404;
      boolean index=linearsearch(nums,target);
      System.out.println("the targeted element is found "+index);
    }

      static boolean linearsearch(int[] nums,int target){
            if(nums.length==0){
              return false;
            }
    
            for(int  item:nums){
                  if(item==target){
                    return true;
                  }
            }
           return false;
       }
}
