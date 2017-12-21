package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseBits {

	
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		long num = 0;
        BufferedReader reader = 
                   new BufferedReader(new InputStreamReader(System.in));
        
        try {
			mNumberOfTestCase = Integer.parseInt(reader.readLine());
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){				
				num = Long.parseUnsignedLong(reader.readLine());
				reverseBits(num);
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
	
	
	private static void reverseBits(long num){
		long rev = 0;
		long lsb;
		for(int i=31; i>= 0 ; i--){
			rev = rev<<1;
			lsb = (num&1);
			rev = rev | lsb;
			num = num>>1;
		}
		System.out.printf("%d", rev);
	}
	
	
}
