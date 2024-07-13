class ques1
{
 public static void main(String x[])
 {
 for(int i=1;i<=5;i++)
 {
	for(int j=1;j<=11;j++)
	{
		if(j>=7-i || j<=4+i)
		{
			System.out.printf("*");
		}
	}
	System.out.printf("\n");
 }
 }
}