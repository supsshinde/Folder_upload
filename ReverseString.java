//Reverse words in string
import java.util.*;
class Reverse
{
 String s;
 int len,n,start=0,end,temp;
 void AddValue(String s)
 {
   this.s=s;
 }
 void showResult()
 {
	len=strlen(s); 
	for(int i=0;i<len;i++)
	{
		if(s[i]==' ' || i==len)
		{
			n=i+1;
			end=i-1;
			while(start<end)
			{
				temp=s[start];
				s[start]=s[end];
                s[end]=temp;
				start++;
			}
		}
	n=start;	
	}
    System.out.printf("%s",s);	
 }
}
public class ReverseString
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string");
		sc.nextLine();
		str=sc.NextLine();
		Reverse R=new Reverse();
		R.AddValue(str);
		R.showResult();
	}
}