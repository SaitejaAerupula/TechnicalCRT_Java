import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int target[]=new int[n];
        int nums[]  new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++){
            int complement = target - nums[i];
            if(map.conatinKey(complement)){
                System.out.println(map.get(complement) + " " + i);
                return;
            }
            map.put(nums[i],i);
        }
    }
}
    