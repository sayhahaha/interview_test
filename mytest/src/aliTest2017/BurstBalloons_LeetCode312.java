package aliTest2017;

import java.util.Stack;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 15, 2017 8:39:03 PM 
* @version 1.0   
*/
public class BurstBalloons_LeetCode312 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] nums = {9,8,0,7,1};
		int [] nums = {3,2,4};
		System.out.println(maxCoins(nums));
	}

	public static int maxCoins(int[] nums) {
	    int[] tnums = new int[nums.length + 2];
	    int n = 1;
	    for (int num : nums) {
	        tnums[n] = num;
	        n++;
	    }
	    tnums[0] = tnums[n++] = 1;
	
	    int[][] coins = new int[n][n];
	    int[][] burstorders = new int[n][n];
	
	    int low, high, k;
	    for (low = n - 1; low >= 0; low--) {
	        for (high = low + 2; high < n; high++) {
	            if ((high - low) == 2) {
	                coins[low][high] = tnums[low] * tnums[(low + high) / 2] * tnums[high];
	                burstorders[low][high] = (low + high) / 2;
	                System.out.println("calculating value of coin[" + low + "][" + high + "]=" + coins[low][high]);
	            } else {
	                for (k = low + 1; k <= high - 1; k++) {
	                    int tcoins = coins[low][k] + coins[k][high] + tnums[low] * tnums[k] * tnums[high];
	                    if(coins[low][high] < tcoins){
	                        coins[low][high] = tcoins;
	                        burstorders[low][high] = k;//记录气球爆破顺序
	                    }
	                }
	            }
	        }
	    }
	    
	    System.out.println("The bursting order is:");
	    printOrders(burstorders,0,n - 1);
	
	    return coins[0][n - 1];
	}
	
	public static void printOrders(int[][] orders,int low,int high){
	    /*recursive 
	     * the output is reverse order
	    if((high - low) == 2){
	        System.out.println("[" + low + "][" + high + "]:" + (orders[low][high] - 1) + " ");
	    }else if((high - low) > 2){
	        int last = orders[low][high];
	        System.out.println("[" + low + "][" + high + "]:" + (last - 1) + " ");
	        printOrders(orders,low,last);
	        printOrders(orders,last,high);
	    }*/
	    
	    //non-recursive
	    class Pair{
	        private int x;
	        private int y;
	        
	        public Pair(int x,int y){
	            this.x = x;
	            this.y = y;
	        }
	    }
	    //因为orders矩阵记录的是最后一个扎破的气球，所以正好用栈把顺序倒过来
	    Stack<Integer> burstballoons = new Stack<>();
	    Stack<Pair> stk = new Stack<>();
	    Pair p = null;
	    stk.push(new Pair(low,high));
	    
	    while(!stk.isEmpty()){
	        p = stk.pop();
	        if((p.y - p.x) == 2){
	            burstballoons.push(orders[p.x][p.y] - 1);
	        }else if((p.y - p.x) > 2){
	            burstballoons.push(orders[p.x][p.y] - 1);
	            stk.push(new Pair(orders[p.x][p.y],p.y));
	            stk.push(new Pair(p.x,orders[p.x][p.y]));
	        }
	    }
	    
	    while(!burstballoons.isEmpty()){
	        System.out.print(burstballoons.pop() + " ");
	    }
	}
	
}
