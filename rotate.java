import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        k=k%n;
        int [] rotate = new int[n];
        for(int i=0;i<n;i++){
            rotate[(i+k)%n]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(rotate[i] + " ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}