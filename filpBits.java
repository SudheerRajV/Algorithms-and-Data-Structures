package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapBits {

	
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		long a = 0, b = 0;
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
        
        try {
			mNumberOfTestCase = Integer.parseInt(reader.readLine());
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){				
				a = Long.parseLong(reader.readLine());
				b = Long.parseLong(reader.readLine());
				swapBits(a,b);
				System.out.printf("\n");
			}
			
        	} catch (NumberFormatException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	} catch (IOException e) {
        		// TODO Auto-generated catch block
        		e.printStackTrace();
        	}
       
        
	}  
	
	
	private static void swapBits(long a, long b){
		long c = a ^ b;
		int count = 0;
		while(c != 0){
			c &= c-1;
			count++;
		}
		System.out.printf("count = %d", count);
	}
	
	
}
