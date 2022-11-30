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
            for(int i=0; i<t; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            }
        }
	}
}
