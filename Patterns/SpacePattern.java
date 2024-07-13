//pattern
class SpacePattern
{
	public static void main(String x[])
	{
	    boolean f=true;
		 for(int i=1;i<=4;i++)
		 {
		  for(int j=1;j<=7;j++)
		  {
			if(j<=8-i && j>=i && f==true)
			{
				System.out.printf("*");
				f=false;
			}
			else
			{
				System.out.printf(" ");
				f=true;
			}
		  }
		  System.out.printf("\n");
		 }
	}
}