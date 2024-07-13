//Check character is alphabet or digit
import java.util.*;
class CheckChar
{
  char ch;
  void setValue(char ch)
  {
	this.ch=ch;  
  }
  boolean checkChar()
  {
	boolean b=false;
    if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
    {
		b=true;
	}
   return b;	
  }
}
public class CheckCharacter
{
 public static void main(String x[])
 {
   char c;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter character");
   c=sc.next().charAt(0);
   CheckChar C=new CheckChar();
   C.setValue(c);
   boolean b=C.checkChar();
   if(b==true)
   {
	System.out.println("character is alphabet");   
   }
   else
   {
	System.out.println("Character is digit");   
   }
 }
}