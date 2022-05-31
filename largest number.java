import java.util.Scanner;
public static void main(String args[])
{
	int i,n,max;
	int arr[];
	scanner sc=new scanner(System.in);
	system.out.println("enter the n number");
	n=sc.nextint();
	arr=new.[n];
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextint();
	}
	max=max_num(arr,n);
	system.out.println("the largest number is"+max);
}
public static void max_num(int[] arr,int m)
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