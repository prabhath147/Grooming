package largestandsmallest;

import java.util.Scanner;

public class SearchNumber {
	public static void main(String[] args) {
		int n,temp,large,small;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter number");
			arr[i]=sc.nextInt();
		}
		System.out.println("enter postion of largest number");
		large=sc.nextInt();
		System.out.println("enter postion of smallest number");
		small=sc.nextInt();
		System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Largest number is"+arr[n-large]);
		System.out.println("Smallest number is"+arr[small-1]);
		
	}

}
