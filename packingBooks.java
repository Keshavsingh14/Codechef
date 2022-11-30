/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here
        Scanner s = new Scanner(System.in)) {
            int size = s.nextInt();
            int[] x = new int[size];
            int[] y = new int[size];
            int[] z = new int[size];
            int[] ans = new int[size];
            for(int i=0; i<=size-1; i++){
                x[i] = s.nextInt();
                y[i] = s.nextInt();
                z[i] = s.nextInt();
            }
            for(int i=0; i<=size-1; i++){
                ans[i] = (int) ((y[i]+z[i]-1)/z[i]*x[i]);
                System.out.println(ans[i]);
            }
        }
	}
}
