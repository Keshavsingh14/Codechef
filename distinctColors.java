/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here
        Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int colors = sc.nextInt();
                int[] keshav = new int[colors];
                for(int i=0; i<colors; i++){
                    keshav[i] = sc.nextInt();
                }
                int max = 0;
                for(int i=0; i<colors; i++){
                    if(keshav[i] > max)
                        max = keshav[i];
                }
                System.out.println(max);
            }
        }
	}
}
