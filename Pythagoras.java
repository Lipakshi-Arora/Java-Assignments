// Given an array of integers, write a function that returns true if there is a triplet (a, b, c) that satisfies a^2 + b^2 = c^2.
// Input:
// The first line contains T, denoting the number of testcases. Then follows description of testcases. Each case begins with a single positive integer N denoting the size of array. The second line contains the N space separated positive integers denoting the elements of array A.

// Output:
// For each testcase, print "Yes" or  "No" whether it is Pythagorean Triplet or not (without quotes).

// Constraints:
// 1 <= T <= 100
// 1 <= N <= 107
// 1 <= A[i] <= 1000

// Example:
// Input:
// 1
// 5
// 3 2 4 6 5

// Output:
// Yes

// Explanation:
// Testcase 1: a=3, b=4, and c=5 forms a pythagorean triplet, so we print "Yes"

import java.util.Arrays;
import java.util.Scanner;

public class Pythagoras {

	public static void main(String[] args) {
		
		
			Scanner sc = new Scanner(System.in);
			int n =sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
				arr[i]=sc.nextInt();
			int i=0;
			int j=n-1;
			int k=j-1;
			Arrays.sort(arr);
			int flag=0;
			for(j=n-1;j>1;j--)
			{
				i=0;
				k=j-1;
				while(i<k)
				{
					
					if(arr[i]*arr[i]+arr[k]*arr[k]==arr[j]*arr[j])
					{    flag=1;
						System.out.println("Yes");
						break;
					}
					else if(arr[i]*arr[i]+arr[k]*arr[k]<arr[j]*arr[j])
					i++;
					else
						k--;
					
				}
				if(flag==1)
					break;
			}
			if(flag==0)
			System.out.println("No");
			
			
			
	}

}
