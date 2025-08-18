
public class Main
{
	public static void main(String[] args) {
		int[] nums={9,3,1,2,5,0};
		int n=nums.length;
		int temp=-1;
		System.out.println("BEFRORE SORTING");
			for(int i:nums){
		    System.out.print(i+" ");
		}
		for(int i=0;i<n-1;i++){
		    for(int j=0;j<n-1-i;j++){
		        if(nums[j+1]<nums[j]){
		            temp=nums[j+1];
		            nums[j+1]=nums[j];
		            nums[j]=temp;
		        }
		    }
		}
			System.out.println("AFTER SORTING");
		for(int i:nums){
		    System.out.print(i+" ");
		}
	}
}
