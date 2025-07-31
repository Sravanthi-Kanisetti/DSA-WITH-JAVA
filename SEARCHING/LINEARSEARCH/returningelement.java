
public class returningelement{
    public static void main(String[] args){
      int[] nums={11,22,33,44,55,66,77,88,99};
      int target=44;
      int index=linearsearch(nums,target);
      System.out.println("the targeted element is "+index);
    }

      static int linearsearch(int[] nums,int target){
            if(nums.length==0){
              return -1;
            }
    
            for(int  item:nums){
                  if(item==target){
                    return item;
                  }
            }
           return -1;
       }
}
