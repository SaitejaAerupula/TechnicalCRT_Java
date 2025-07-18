  import java.io.*;
import java.util.*;
public class towerofhonoi {

    public static void move(int n,String source,String Aux,String des){
        if(n==1){
            System.out.println("Move disk 1 from " + source +  " to " + des);
            return;
        }
        move(n-1,source,des,Aux);
        System.out.println("Move disk " + n + " from " + source + " to " + des);
        move(n-1,Aux,source,des);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        move(n,"A","B","C");
           
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

