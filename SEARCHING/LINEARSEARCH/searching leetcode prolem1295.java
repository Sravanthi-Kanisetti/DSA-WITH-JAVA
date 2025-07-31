class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int item:nums){
            int cod=countofDigits(item);
            if(cod%2==0){
                count++;
                 }
          }

             return count;

            }


            int countofDigits(int item){
            int incount=0;
            while(item>0){
                incount++;
                item=item/10;
            }
            return incount;
        }
       
 

































































































        
    }
