import java.util.Scanner;
class largest_number
{
public static void main(String args[])
{
	int i,n,max;
	int arr[];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the n number");
	n=sc.nextInt();
	arr=new int[n];
	System.out.println("enter "+n+" numbers");
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	max=max_num(arr,n);
	System.out.println("the largest number is "+max);
}
 static int max_num(int[] arr,int n)
{
	int i,m;
	m=0;
	for(i=0;i<n;i++)
	{
		if(arr[i]>m)
		{
			m=arr[i];
		}
	}
	return m;
}
}