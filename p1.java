class lohith
{
	public static void main(String[]  args)
	{
		int n=5;
		char d='a';
		
                for (int i=0; i<n; i++)
                {
		
                     for (int j=0; j<n; j++)
                     {
			if(i+j==n-1||i==0||i==n-1) 
			{
			System.out.print(d++);
			}
			else
			System.out.print(" ");
			
                     }
		System.out.println();
                }
        }
}


                        