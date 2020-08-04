package sortingAlgorithmsinJava;

import java.util.Scanner;

public class SelectionSort {

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
		
//		Selection Sort Code
		
		int minvalue;
		int temp;
		
		for(int i=0;i<n-1;i++) {
//			initialize the value of minvalue
			minvalue=i;
			for(int j=i;j<n;j++) {
//				this condition find the minimum value 
				if(arr[j]<arr[minvalue]) {
					minvalue=j;
				}
				
//				swapping with minimum value
				temp=arr[minvalue];
				arr[minvalue]=arr[i];
				arr[i]=temp;
				
			}
			
		}

//	here we use for each loop to print the values of sorted array
			for(int item:arr) {
				System.out.print(item+" ");
			}
		
	}

}
