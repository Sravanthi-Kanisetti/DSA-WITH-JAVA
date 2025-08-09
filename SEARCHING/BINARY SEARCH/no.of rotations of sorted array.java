
public class Main
{
	public static void main(String[] args) {
		int[] nums={3,4,5,6,7,8,9,0,1,2};
		int target=3;
		
       System.out.println(countofrotations(nums));
	
	}
	
	static int countofrotations(int[] nums){
	    int resa=findPivot(nums);
       /* if(resa==-1){
            return 0;
        }*/
        //here if it return -1=>-1+1 means 0 zero means no rotations so we can just simply return resa+1
        return resa+1;
		}
	
	
	
	
  static int findPivot(int[] nums){
      int start=0;
      int  end=nums.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(mid<end && nums[mid]>nums[mid+1] ){
              return mid;
          }
          if( mid>start && nums[mid]<nums[mid-1] ){
              return mid-1;
          }
          if(nums[start]<nums[mid]){
              start=mid+1;
          }
          else{
              end=mid-1;
          }
      }
      return -1;
  }	
  
  
  
  
            
  }
