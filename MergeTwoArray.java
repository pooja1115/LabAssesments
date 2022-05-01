import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		int b[]= new int[5];
		int merge[]=new int[10];
		int i,k=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter element in first array");
		for(i=0;i<5;i++)
		{
			 a[i]=sc.nextInt();
		}
		System.out.println(" element of first array");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("enter element in second array");
		for(i=0;i<5;i++)
		{
			 b[i]=sc.nextInt();
		}
		//System.out.println(" element of second array");
		for(i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("after merge two array");
		for(i=0;i<5;i++)
		{
			merge[i]=a[i];
		}
	   for(i=0;i<5;i++)
		 {
			  merge[k]=b[i];
			  k++;
		}
		for(i=0;i<10;i++)
		{
			System.out.print(merge[i]+" ");
		}
		
		
		

	}
}