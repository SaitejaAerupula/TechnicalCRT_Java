  import java.io.*;
import java.util.*;
public class uniquepermusingrecur {
    static Set<String> ob = new LinkedHashSet<>();
       
    public static void pm(String s,String ans)
    { if(s.length()==0){
            ob.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            String lss=s.substring(0,i);
            String rss=s.substring(i+1);
            String pss = lss+rss;
            pm(pss,ans+c);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        pm(s,"");
        for(String unique:ob){
            System.out.println(unique);
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
