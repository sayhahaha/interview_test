package test;

import java.util.Scanner;

/** 
* @author xxh 	
* @date 创建时间：Aug 22, 2017 3:24:03 PM  
*/
public class LCA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(getLCA(a,b));
	}

	public static int getLCA(int a, int b) {
		// TODO Auto-generated method stub
		int depthA=getDepth(a);
		int depthB=getDepth(b);
		if(depthA>depthB)
		{
			while(depthA-depthB!=0)
			{
				a=a/2;
				depthA--;
			}
		}
		if(depthA<depthB)
		{
			while(depthB-depthA!=0)
			{
				b=b/2;
				depthB--;
			}
		}
		while(a!=b)
		{
			a/=2;
			b/=2;
		}
		return a;
	}

	public static int getDepth(int a) {
		// TODO Auto-generated method stub
		int depth=0;
		while(a!=0)
		{
			depth++;
			a=a/2;
		}
		return depth;
	}
	//二叉树是个二叉查找树，且root和两个节点的值(a, b)已知。
	public static TreeNode getLCA1(TreeNode root,int a,int b)
	{	
		while(root!=null)
		{
			if(root.val > a && root.val > b){
				root=root.left;
			}else if(root.val < a && root.val < b){
				root=root.right;
			}else
				return root;
		}
		return null;
	}	
}
