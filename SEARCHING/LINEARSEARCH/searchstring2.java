
import java.util.*;

public class searchstring2{
    public static void main(String[] args){
        String name="Sravanthi Kanisetti";
        char target='P';
        boolean result=search(name,target);
        System.out.println("yeah the character is found in string is "+result);
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    
    
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        
        for(char c:name.toCharArray()){
            if(c==target){
                return true;
            }
        }
        return false;
    }
}
