/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here
        Scanner sc = new Scanner(System.in)) {
            int te = sc.nextInt();
            while(te-->0){
                int no = sc.nextInt();
                System.out.println(no * 15);
            }
        }
	}
}

