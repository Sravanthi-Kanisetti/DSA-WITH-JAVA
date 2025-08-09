public class Main{
    public static void main(String[] args){
       int[] nums = {1,2,3,4,5};
       int k = 2;
       System.out.println(splitArray(nums,k));
    }
    
      static int splitArray(int[] nums, int k) {
           
           int start=0;
           int end=0;
           for(int i=0;i<nums.length;i++){
               start=Math.max(start,nums[i]);
               end+=nums[i];
           }
           
           while(start<end){
               int mid=start+(end-start)/2;
               int sum=0;
               int pieces=1;
               for(int n:nums){
                   if((sum+n)>mid){
                       sum=n;
                       pieces++;
                   }
                   else{
                       sum+=n;
                   }
               }
               if(pieces>k){
                   start=mid+1;
               }
               else{
                   end=mid;
               }
           }
           
           return end;
        
    }
}
