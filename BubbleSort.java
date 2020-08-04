package sortingAlgorithmsinJava;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
//		Enter the size/length of array
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		
//		declare the array
		int arr[]=new int[n];
		
//		assign the values to array
		System.out.println("Enter the values of array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
//		Bubble Sort Code
		int temp;
		
//		this variable is used to make our outer loop optimize
//		means to reduce the execution time of outer loop
		boolean sorted=true;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
//				swapping condition
				if( arr[j] > arr[j+1] ) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					sorted=false;
					
				}
				
			}
			
			if(sorted) {
				break;
			}
		}
		
//		new type of for loop 
//		for each loop 
//		the item variable fetch the values one by one from arr
		for(int item:arr) {
			System.out.print(item+" ");
		}
/*  or we can use this also
 *  for(int i=0;i<n;i++){
 *     System.out.print(arr[i]+" ");
 *  }
 */

	}

}
