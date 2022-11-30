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
                String str = sc.next();
                String str1 = str.substring(0,str.length()/2);
                String str2 = str.substring(str.length()/2);
                if((str2 + str1).equals(str)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
	}
	
}
