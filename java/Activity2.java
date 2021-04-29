package activities;

import java.util.Arrays;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= {20,14,15,10,20,30,10,-16,19};
		int t_result = 0,t_result1 = 0;
		System.out.println("The list of numbers in the array: "+Arrays.toString(numbers));
		System.out.println("The length of the array elements is:"+numbers.length);
		for(int i=0;i<=numbers.length-1;i++) {
			//System.out.println("Array value:"+numbers[i]);
			if(numbers[i]==10) {
				
				t_result += numbers[i];
				t_result1 = t_result+numbers[i];
				if(t_result1 == 20) {
					System.out.println("Total sum value is: "+t_result1);
				}
			}
			
		}
				
		
		int srchNum = 10;
		int result = 20;
		
		System.out.println("The sum of the array is: "+resultArray(numbers, srchNum, result));
		
	}
	
	public static boolean resultArray(int[] numbers,int srchNum, int result) {
		
		int temp = 0;
		for(int number : numbers) 
		{
			if(number == srchNum) {
				temp += srchNum;
			}
		
		if(temp > result) {
			break;
			}
		}
		return temp == result;
		
	}

}
