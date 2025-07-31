
public class basiccode{
    public static void main(String[] args){
      int[] nums={11,22,33,44,55,66,77,88,99};
      int target=55;
      int index=linearsearch(nums,target);
      System.out.println("the element is at index"+index);
    }

      static int linearsearch(int[] nums,int target){
            if(nums.length==0){
              return -1;
            }
    
            for(int i=0;i<nums.length;i++){
                  if(nums[i]==target){
                    return i;
                  }
            }
           return -1;
       }
}
