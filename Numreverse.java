 import java.io.*;
import java.util.*;
public class Numreverse {
    public static void decrent(int n){
        if(n==0)
            return;
        System.out.print(n+" ");
        decrent(n-1);
        System.out.print(n+" ");
    }
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        decrent(n);
    }
}
