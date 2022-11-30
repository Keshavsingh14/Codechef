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
                int nm = sc.nextInt();
                int[] keshav = new int[2*nm];
                for(int i=0; i<keshav.length; i++){
                    keshav[i] = sc.nextInt();
                }
                Arrays.sort(keshav);
                int cnt = 0;
                boolean flg = false;
                for(int i =0; i<keshav.length-1; i++){
                    if(keshav[i] == keshav[i+1]){
                        cnt++;
                        if(cnt>=2){
                            flg = true;
                            break;
                        }
                    }else{
                        cnt = 0;
                    }
                }
                if(flg){
                    System.out.println("NO");
                }
                else{
                    System.out.println("YES");
                }
                }
        }
		}
	}

