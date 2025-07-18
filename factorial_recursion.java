 import java.io.*;
import java.util.*;
public class factorial_recursion {
    public static Integer factor(int n){
    if(n==0||n==1)
        return 1;
        return n*factor(n-1);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int c=factor(n);
         System.out.print(c);
    }
}

