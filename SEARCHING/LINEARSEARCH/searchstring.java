
public class searchstring{
    public static void main(String[] args){
        String name="Sravanthi Kanisetti";
        char target='K';
        boolean result=search(name,target);
        System.out.println("yeah the character is found in string is "+result);
    }
    
    
    static boolean search(String name,char target){
        if(name.length()==0){
            return false;
        }
        
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
