/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
	try{Scanner sc = new Scanner(System.in);
	int test = sc.nextInt();
	while(test-->0){
	    int no = sc.nextInt();
	    int aa = sc.nextInt();
	    int bb = sc.nextInt();
	    int summ = 0;
	    int coun = 0;
	    while(no != 1){
	        summ = summ + aa;
	        no = no / 2;
	        coun++;
	    }
	    int ansss = summ + (coun-1)*bb;
	    System.out.println(ansss);
	}
	}
	catch(Exception e){
	    System.out.println("exception");
	}
}
}