package day9;

import java.util.HashSet;

public class longestConsecutiveSequence{
    public static int sequence(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int x : arr){
            set.add(x);
        }
        int longest=0;
        for(int a : set){
            if(!set.contains(a-1)){
                int curr = a;
                int c = 1;
                while(set.contains(curr+1)){
                    curr++;
                    c++;
                }
                longest = Math.max(longest,c);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100,4,200,1,3,2};
        System.out.println(sequence(arr));
    }
}
