//Reverse words in string
import java.util.*;
class Reverse
{
 char s[];
 String str;
 int n,start=0,end;
 void AddValue(char ch[])
 {
   s=ch;   // hello supriya shinde
 }
 String showResult()
 {
	int len=s.length;  //20
	for(int i=0;i<len;i++)
	{
		if(s[i]==' ' || i==len)   
		{
			n=i+1;
			end=i-1;
			while(start<end)
			{
				char temp=s[start];
				s[start]=s[end];
                s[end]=temp;
				start++;
				end--;
			}
		start=n;		
		}
	}
	str=String.valueOf(s);  //convert character array to string
    return str;	
  }
}
public class ReverseStringWords
{
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter string");
		str=sc.nextLine();
		str=str+" ";
		char ch[]=str.toCharArray();   //convert string to character array
		Reverse R=new Reverse();
		R.AddValue(ch);
		String result=R.showResult();
		System.out.println(result);
	}
}