package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class ConvertingAnagrams {

	
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		String a = "", b = "";
		    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		try {
			
			
		mNumberOfTestCase = Integer.parseInt(br.readLine());
		
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){
				
				StringTokenizer n = new StringTokenizer(br.readLine());
				a = n.nextToken();
				b = n.nextToken();
				
				
				convertingAnagrams(a,b);
				
			}     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	
	
    
    
   
    
    private static void convertingAnagrams(String a, String b)
    {
    	
            int count1[] = new int[26]; 
            int count2[] = new int[26];
     
            
            for (int i = 0; i < a.length() ; i++)
                count1[a.charAt(i) -'a']++;
         
            
            for (int i = 0; i < b.length() ; i++)
                count2[b.charAt(i) -'a']++;
     
            
            int result = 0;
            for (int i = 0; i < 26; i++)
                result += Math.abs(count1[i] -
                                   count2[i]);
           
            System.out.println(result);
        
        
    }
    
    
    
    
    
	
		
}
