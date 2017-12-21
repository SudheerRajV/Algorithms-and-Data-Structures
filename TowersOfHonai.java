package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TowersOfHonai {

	
	
	public static void main(String args[]){  
		
		int mNumberOfTestCase = 0;
		int mNoOfDisc = 0;
		
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		try {
		mNumberOfTestCase = Integer.parseInt(br.readLine());
			
			for(int tc = 0; tc < mNumberOfTestCase; tc++ ){				
				mNoOfDisc = Integer.parseInt(br.readLine());
				System.out.println((int)Math.pow(2, mNoOfDisc)-1);
				towersOfHonai(mNoOfDisc,'A', 'B', 'C');
				
			}     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	
	private static void towersOfHonai(int n, char from_rod,char aux_rod,char to_rod){
		
		
		if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
		towersOfHonai(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towersOfHonai(n-1, aux_rod, to_rod, from_rod);
			
		
	}
		
}
