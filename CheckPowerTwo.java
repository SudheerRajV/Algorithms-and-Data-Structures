package week1;


import java.util.Scanner;

public class CheckPowerTwo {

	
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		
		long a;
        
        Scanner sc = new Scanner(System.in);
        
       
			mNumberOfTestCase = sc.nextInt();
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){				
				
				
				a = sc.nextLong();
				
				
				checkPower(a);
				
				
				
			}
			
			sc.close();
       
        
	}  
	
	
	private static void checkPower(long n){
		
		 if((n&(n-1)) == 0)       
		System.out.println("True");
		 else
			 System.out.println("False");
		
		
	}
		
}
