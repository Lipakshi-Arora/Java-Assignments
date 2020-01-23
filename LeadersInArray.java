// Given an array of positive integers. Your task is to find the leaders in the array.
// Note: An element of array is leader if it is greater than or equal to all the elements
// to its right side. Also, the rightmost element is always a leader.

// Input : 5
//             7 4 5 7 3

// Output: 7 7 3
// All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all the elements 
// of right side of 7 (at index 3) are smaller than 7. And, the last element 3 is itself a leader since no elements are on its right.


import java.util.Scanner;
public class LeadersInArray {

	public static void findLeaders(int arr[]) {
		int l=arr.length;
		int leader;
		int flag=0;
		for(int i=0;i<l;i++) {
			leader=arr[i];
			flag=0;
			for(int j=i;j<l;j++) {
				if(leader<arr[j]) {
					flag=1;
					break;
				}	
			}
			if(flag==0) {
				System.out.print(leader+" ");
			}
		}
	}

	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size=s.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		findLeaders(arr);
		s.close();
	}
}
