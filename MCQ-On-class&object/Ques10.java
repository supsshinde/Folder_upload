public class Ques10
{
public static void main(String args[])
{
Ques10 q = new Ques10();
q.myMethod (10,20);
q.myMethod (new long[]{});
q.myMethod (new int[]{10,20});
}
void myMethod (short s1, short s2)
{
System.out.println ("short");
}
void myMethod (int i1, int i2)
{ System.out.println ("int");
}
void myMethod (int ...args)
{
System.out.println ("intargs");
}
}
