
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   int[][] arr={
	       {15,42},
	       {32,64,85},
	       {68,79,83,95}
	   };
	 
	   int result=maximum(arr);
	   System.out.println("maximum element is  "+result);
	}
	
	
	
	static int maximum(int[][] arr){
	    int mada=Integer.MIN_VALUE;
	   for(int[]lisa:arr){
	       for(int i:lisa){
	           if(i>mada){
	               mada=i;
	           }
	       }
	   }
	 return mada;
	 
	}
}
