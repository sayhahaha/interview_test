package test;

import java.util.Scanner;

public class txTest2_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int k=in.nextInt();
			int i=in.nextInt();
			int j=in.nextInt();
			int m=in.nextInt();
			int head=1;
			int tail=(1<<k)-1;
			int mid;
			int min=(i<j?i:j);
			min=min<m?min:m;
			int max=(i>j?i:j);
			max=max>m?min:m;
			while(head<=tail)
			{
				mid=(head+tail)/2;
				if(min<mid&&max>=mid)
				{
					System.out.println(mid);
					break;
				}
				else if(min>mid)
					head=mid+1;
				else if(max<mid)
					tail=mid-1;			
			}		
		}
	}
}
