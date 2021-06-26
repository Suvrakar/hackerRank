import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  // Complete this function
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int count=0;
        for(int i=0;i<ar.length-1;i=i+2)
        {
            if(ar[i]==ar[i+1])
            {
                count++;
            }
            else
            {
                i--;
            }
        }
        return count;
      
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
