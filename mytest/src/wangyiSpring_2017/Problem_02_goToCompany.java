package wangyiSpring_2017;
import java.util.Scanner;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 12, 2017 10:48:07 AM 
* @version 1.0   
*/
public class Problem_02_goToCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int tx[]=new int[n];
		int ty[]=new int[n];
		for(int i=0;i<n;i++)
			tx[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			ty[i]=sc.nextInt();
		int gx=sc.nextInt();
		int gy=sc.nextInt();
		int walkTime=sc.nextInt();
		int taxiTime=sc.nextInt();
		System.out.println(shortTime(tx,ty, gx, gy, walkTime,taxiTime));
	}

	public static int  shortTime(int[] tx, int[] ty, int gx, int gy, int walkTime, int taxiTime) {
		// TODO Auto-generated method stub
		int min=Integer.MAX_VALUE;
		int len=tx.length;
		for(int i=0;i<len;i++)
		{
			int walk=(Math.abs(gx)+ Math.abs(gy))*walkTime;
			int walkAndTaxi=(Math.abs(tx[i])+ Math.abs(ty[i]))*walkTime+( Math.abs(gx-tx[i])+Math.abs(gy-ty[i]))*taxiTime;			
			min=Math.min(min, walk);
			min=Math.min(min, walkAndTaxi);
		}		
		return min;
	}

}
