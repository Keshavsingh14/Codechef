/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0){
		    int am = sc.nextInt();
		    int bm = sc.nextInt();
		    int su = am + bm;
		    
		    int cnt = 0;
		    for(int i =2; i<su; i++){
		        if(su % i == 0){
		            cnt++;
		        }
		    }
		    if(cnt == 0){
		        System.out.println("ALICE");
		    }
		    else{
		        System.out.println("BOB");
		    }
		}
	}
}

