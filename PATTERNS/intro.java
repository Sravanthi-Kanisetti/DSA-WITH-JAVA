
public class Main
{
	public static void main(String[] args) {
	    pattern1(5);
	   pattern2(5);
     pattern32(5);
       pattern3mine(5);
    pattern4(5);
     pattern5mine(5);
	        pattern5(5);
	    
	}
	
	static void pattern1(int n){
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            System.out.print('*');
	        }
	        System.out.println();
	    }
	}
	
	static void pattern2(int n){
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print('*');
	        }
	        System.out.println();
	    }
	}


  	static void pattern3mine(int n){
	    for(int i=n;i>=1;i--){
	        for(int j=1;j<=i;j++){
	            System.out.print('*');
	        }
	        System.out.println();
	    }
	}
		static void pattern32(int n){
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n+1-i;j++){
	            System.out.print('*');
	        }
	        System.out.println();
	    }
	}

    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }



  static void pattern5mine(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                  System.out.print("*");
            }
              System.out.println();
        }
    }


  static void pattern5(int n){
     for(int i=1;i<2*n;i++){
         int totalcols=i>n?2*n-i:i;
         for(int j=1;j<=totalcols;j++){
             System.out.print("*");
         }
         System.out.println();
     }
    }
}
