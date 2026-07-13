package day6;

import java.util.Arrays;

public class candies{
    public static int candy(int[] rating){
        int n = rating.length;
        int[] c = new int[3];
        Arrays.fill(c,1);
        for(int i=1; i<n; i++){
            if(rating[i]>rating[i-1]){
                c[i] = c[i-1]+1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(rating[i]>rating[i+1]){
                c[i] = Math.max(c[i],c[i+1]+1);
            }
        }
        int t=0;
        for(int x : c){
            t += x;
        }
        return t;
    }
    public static void main(String[] args) {
        int[] rating = {1,0,2};
        System.out.println(candy(rating));
    }
}

