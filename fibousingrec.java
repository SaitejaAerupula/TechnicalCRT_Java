 import java.io.*;
import java.util.*;
public class fibousingrec {
   
    public static Integer fib(int n){
        if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int r=fib(n);
        System.out.print(r);
        
        
    }
}
