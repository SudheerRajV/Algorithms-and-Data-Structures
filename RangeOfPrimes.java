package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class RangeOfPrimes {

	
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		int start = 0, end = 0, size = 0;
		    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		try {
			
			
		mNumberOfTestCase = Integer.parseInt(br.readLine());
		
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){
				
				StringTokenizer n = new StringTokenizer(br.readLine());
				start = Integer.parseInt(n.nextToken());
				end = Integer.parseInt(n.nextToken());
				size = (end - start)+1;
				
				int[] arr = new int[size];
				
				for(int i = 0; i < size; i++ )
				{
					arr[i] = start++;
					System.out.println(arr[i]);
				}
				
				noOfPrimes(arr,size);
				
			}     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	
	
    
    
    private static void noOfPrimes(int arr[], int n)
    {
    	int cnt = 0;
    	
        for(int i = 0; i<n;i++)
        {
        	if(checkPrime(arr[i]))
        		cnt++;
        }
        System.out.println(cnt);
        
    }
    
    private static boolean checkPrime(int num){
    	int i,m=0,flag=0;      
    	  m=num/2;      
    	  if(num==0||num==1){  
    	   return false;      
    	  }else{  
    	   for(i=2;i<=m;i++){      
    	    if(num%i==0){           
    	     flag=1;      
    	     break;      
    	    }      
    	   }      
    	   return flag==0 ? true:false;
    	   }  
    }
    
    
    
    
    
	
		
}
