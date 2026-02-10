class Q3
 {
    
    public static void main(String[] args) 
	{
        System.out.print("Enter n: ");
        int n = Integer.parseInt(args[0]);
        
        for (int m = 2, c = 0, i; c < n; m++)
			{
            	for (i = 2; i < m && m % i != 0; i++);
            		if (i == m)
					{
                		System.out.print(m + " ");
                		c++;
    				}
			}
	}
 }