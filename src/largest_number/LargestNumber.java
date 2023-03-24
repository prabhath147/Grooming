package largest_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class LargestNumber {
	public static void main(String[] args) {
		int n;
		//int arr[]= {30,6,8,19,15,1};
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of array");
		n = sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter number");
			arr[i]=sc.nextInt();
		}
		boolean finished=false;
		Map<Integer,Integer> map=new HashMap<>();
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		for(int i=0;i<arr.length-1;i++) {
			map.put(arr[i], i);
		}
		for(int i=0;i<arr.length-1 && !finished;i++) {
			int sum=arr[i];
			List<Integer> list=new ArrayList<>();
			list.add(arr[i]);
			for(int j=i+1;j<arr.length-1;j++) {
				sum+=arr[j];
				list.add(arr[j]);
				if(map.containsKey(max-sum)) {
					list.add(arr[map.get(max-sum)]);
					System.out.println(list);
					finished=true;
					break;
				}
			}
		}
		
		if(!finished) {
			System.out.println("not possible");
		}
	}

}
