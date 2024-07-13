//pattern
class Pattern
{
	public static void main(String x[])
	{
		 for(int i=1;i<=3;i++)
		 {
		  for(int j=1;j<=5;j++)
		  {
			if(j<=6-i && j>=i)
			{
				System.out.printf("*");
			}
			else
			{
				System.out.printf(" ");
			}
		  }
		  System.out.printf("\n");
		 }
	}
}