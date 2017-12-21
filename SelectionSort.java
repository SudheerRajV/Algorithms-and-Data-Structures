package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SelectionSort {

	
	
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
				
				selectionSort(arr,size);
				
			}     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	
	private static void selectionSort(int[] arr,int size){
		int temp = 0;
		
		for(int i = 0; i < size-1; i++ ){	
			
			int max = 0, k = size-i-1;
			for(int j = 0; j < size-i; j++){	
				if(arr[max] < arr[j])
				{
					
					max = j;
					
					
				}
				
			}
			System.out.printf("%d ",max);
			
			temp = arr[k];
			arr[k] = arr[max];
			arr[max] = temp;
//			for(int l = 0; l < size; l++ )
//				System.out.printf("%d ",arr[l]);
//			System.out.printf("\n");
			}
			
			
		
		
		
			
		
	}
		
}
