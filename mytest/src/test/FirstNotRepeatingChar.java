package test;
/** 
* @author xxh 	
* @date 创建时间：Sep 13, 2017 10:58:52 AM  
*/
public class FirstNotRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abaccbdeff";
		System.out.println(firstNotRepeatingChar(str));
	}

	public static int firstNotRepeatingChar(String str) {
		if(str==null || str.length()==0)
			return 0;
		char chr[]=str.toCharArray();
		int hash[]=new int[128];
		for(int i=0 ; i<chr.length;i++){
			hash[chr[i]]++;
		}
		int i=0;
		for(i=0; i<chr.length;i++){
			if(hash[chr[i]]==1)
				break;
		}
        return i;
    }
}
