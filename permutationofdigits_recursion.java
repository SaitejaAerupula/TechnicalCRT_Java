  import java.io.*;
import java.util.*;
public class permutationofdigits_recursion {
  
    public static void perm(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            String iss =s.substring(0,i);
            String rss =s.substring(i+1);
            String pss=iss+rss;
            perm (pss,ans+ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String sw=sc.nextLine();
        perm(sw,"");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
