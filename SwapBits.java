package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapBits {

	
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		long num = 0;
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
        
        try {
			mNumberOfTestCase = Integer.parseInt(reader.readLine());
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){				
				num = Long.parseLong(reader.readLine());
				swapBits(num);
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
	
	
	private static void swapBits(long num){
		long evenBits = num & 0xAAAAAAAA;
		long oddBits = num & 0x55555555;
		evenBits>>=1;
		oddBits<<=1;
		System.out.printf("%d", evenBits|oddBits);
	}
	
	
}
