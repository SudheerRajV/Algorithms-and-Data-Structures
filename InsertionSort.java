package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class InsertionSort {

	
	
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
				
				insertionSort(arr,size);
				
			}     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	
	private static void insertionSort(int[] arr,int size){
		int temp = 0, j = 0;
		
		for(int i = 1; i < size; i++ ){	
			
			temp = arr[i];
			j = i;
			while(j>0 && temp < arr[j-1]){
				arr[j] = arr[j-1];
				j = j-1;
				
			}
			System.out.printf("%d ",j);
			arr[j] = temp;
			}
			
			
		System.out.printf("\n");
		
		
			
		
	}
		
}
