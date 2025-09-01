
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World"+new ArrayList<>());
		String series="";
		for(int i=0;i<26;i++){
		    char ch=(char)('a'+i);
		    System.out.println(ch);
		    series+=ch;
		}//this makes time complexity as n*2,but we need n complexity which can be done by stringbuilder
		System.out.println(series);
		//string always creates new objects which makes more time complexity but stringbuilder doesnt create new objects it just 
		//modifies the current object and give new object which makes time complexity as n
	StringBuilder seriesa=new StringBuilder();
		for(int i=0;i<26;i++){
		    char ch=(char)('a'+i);
	
		    seriesa.append(ch);
		}
	
		System.out.println("welcome");
		System.out.println(seriesa);
		System.out.println(seriesa.toString());
		seriesa.deleteCharAt(19);
		System.out.println(seriesa.toString());
		seriesa.reverse();//string is immutable so  even though we apply reverse it doesnt effect original one
		System.out.println(seriesa.toString());
		System.out.println(series.indexOf('s'));		
				
				
				
				
				
				
				
				
				
		String myname="Sravanthi Director"; 
		System.out.println(Arrays.toString(myname.toCharArray()));
				
	
		//System.out.println(myname.toUpperCase());
		System.out.println(myname);
		
		StringBuilder frd=new 	StringBuilder("Bandaaaaaaaaaa");
	//	System.out.println(frd.toUpperCase());stringbuilder dosesnt have this type of methods
		System.out.println(frd);
		
		
				
		System.out.println("    Sravanthi Director  ");
			System.out.println("    Sravanthi Director  ".strip());
		String	resa="my name is sravanthi and iam a film director";
		System.out.println(Arrays.toString(resa.split(" ")));
				
				
				
				
				
				
				
				
		String checker="u";
		boolean ispal=Palindrome(checker);
		System.out.println("the gives string is palindrome  "+ispal); 
		boolean ispaltwo=Palindrometwo(checker);
	System.out.println("the gives string is palindrometwo  "+ispal); 
		
	}
	
	static boolean Palindrome(String strs){
	    int start=0;
	    int end=strs.length()-1;
	    strs=strs.toLowerCase();//it sia lwasy better to convert our string into lowercase while checking forpalindrome 
	    while(start<=end){
	        if(strs.charAt(start)!=strs.charAt(end)){
	            return false;
	        }
	        start++;
	        end--;
	    }
	    return true;
	    
	}
	
	
	static boolean Palindrometwo(String str){
	    if(str==null || str.length()==0){
	        return true;
	    }
	    str=str.toLowerCase();
	    for(int i=0;i<str.length()/2;i++){
	        char start=str.charAt(i);
	        char end=str.charAt(str.length()-1-i);
	        if(start!=end){
	            return false;
	        }
	    }
	    return true;
	}
}
