/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main(String args[]) throws java.lang.Exception
    {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while((t--)>0){
                String str1 = sc.next();
                int s = str1.length();
                HashMap<Character, Integer> hash = new HashMap<>();
                for(int j =0; j<s; j++){
                    char c = str1.charAt(j);
                    if(hash.containsKey(c)){
                        int re = hash.get(c);
                        int K = re+1;
                        hash.put(c,K);
                    }
                    else{
                        hash.put(c, 1);
                    }
                }
                boolean flg = true;
                for(Character ky : hash.keySet()){
                    Integer A = hash.get(ky);
                    if(A%2 != 0){
                        flg = false;
                        break;
                    }
                }
                if(flg){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
