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