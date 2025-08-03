class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
	    int start=0;
	    int end=letters.length-1;
	    while(start<=end){
	        int mid=start+(end-start)/2;
	        if(target<letters[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
	    }
	    return letters[start%letters.length];
}
}

//here actually first i write code as 
          /*       if(target<letters[mid]){
                                end=mid-1;
                            }
                if(target>letters[mid]){
                                start=mid+1;
                           } */
//but here oine case is missing that is target==letters[mid] to handle that i writre it as else
//so in else conditions it covers both target>letters[mid] and target=letters[mid]


//why we write it as start%letters.length instead of start is sometime starts values is >=letters.length 
 // if that is case we need to give letters first element for that we write it as  	    return letters[start%letters.length]; 
