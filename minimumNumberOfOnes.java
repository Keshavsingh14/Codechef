/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here
        Scanner sc = new Scanner(System.in)) {
            int test = sc.nextInt();
            while(test-->0){
                int N = sc.nextInt();
                 N = N/2;
                System.out.println(N);
            }
        }
	}
}
