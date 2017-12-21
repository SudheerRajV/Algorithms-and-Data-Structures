package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TripleTrouble {

	static final int INT_SIZE = 32;
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		int size = 0;
		    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		try {
		mNumberOfTestCase = Integer.parseInt(br.readLine());
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){				
				size = Integer.parseInt(br.readLine());
				int[] arr = new int[size];
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int i = 0; i < size; i++ )
				{
								
					if(st.hasMoreTokens())
					{
						arr[i] =  Integer.parseInt(st.nextToken());
					
					}
				}
				
				getSingle(arr,size);
				
			}     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	
	
    
    
    private static void getSingle(int arr[], int n)
    {
        int result = 0;
        int x, sum;
         
        
        for(int i=0; i<INT_SIZE; i++)
        {
            
            sum = 0;
            x = (1 << i);
            for(int j=0; j<n; j++)
            {
                if((arr[j] & x) == 0)
                sum++;
            }
            
            if ((sum % 3) == 0)
            result |= x;
        }
        System.out.println(result);
    }
    
    
	
		
}
