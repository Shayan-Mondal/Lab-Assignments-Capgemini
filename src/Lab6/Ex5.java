package Lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Ex5 {

	public static ArrayList<Integer> getSecondLargestElement(int ar[]){
		
		ArrayList<Integer>list=new ArrayList<Integer>();
		for(int i=0;i<ar.length;i++) {
			list.add(ar[i]);
		}
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		ArrayList<Integer>arr1=getSecondLargestElement(arr);
		System.out.println(arr1);
		System.out.println(arr1.get(1));
		
		sc.close();
	}
	

}