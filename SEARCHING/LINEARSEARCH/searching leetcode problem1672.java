class Solution {
    public int maximumWealth(int[][] accounts) {
        int result=Integer.MIN_VALUE;
        for(int[] arr:accounts){
            int suma=0;
            for(int item:arr){
                suma+=item;
            }
            if(suma>result){
                result=suma;
            }

        }
        return result;
        
    }
}
