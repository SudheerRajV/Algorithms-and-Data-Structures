package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RepatedNumbers {

	
	
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
				
				countSort(arr,size);
				
			}     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	
	private static void countSort(int[] arr,int size){
		int cnt[] = new int[size];
		
		for(int i = 0; i < size; ++i )
			++cnt[arr[i]];	
		
		for(int i = 0; i < size; i++ )
		{
			if(cnt[i] == 1)
		System.out.printf("%d ",i);
		}
		
		System.out.printf("\n");
	}
	
	static final int INT_SIZE = 32;
    
    
	
		
}
