2)Longest Substring With Monotonic


import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        if(n==0){
            System.out.println(0);
            return;
        }
        int il=1,dl=1,ml=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)>s.charAt(i-1)){
                il++;
                dl=1;
            }else if(s.charAt(i)<s.charAt(i-1)){
                dl++;
                il=1;
            }else{
                il=dl=1;
            }
            ml=Math.max(ml,Math.max(il,dl));
            
            }
        System.out.println(ml);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
}