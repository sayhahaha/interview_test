package test;

public class StrToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" -2147483647";
		System.out.println(strToint(s));
	}

	 public static int strToint(String str) {
		char []s=str.toCharArray();
		int flag=1,sum=0;
		if(s.length==0)
			return 0;
		int i=0;
		while(i<s.length && s[i]==' ')
			i++;
		
		if(i<s.length && (s[i]=='-'||s[i]=='+')){
			if(s[i]=='-')
				flag=-1;
			i++;
		}
		
		while(i<s.length && s[i]>'0'&&s[i]<'9')
		{
			sum=sum*10+(s[i]-'0');
			if(sum<0 && flag==1){
				return Integer.MAX_VALUE;
			}
			if(sum<0 && flag==-1){
				return Integer.MIN_VALUE;
			}
			i++;
		}
		return flag*sum;
	    }
}
