package day9;

public class subarraySumDivisible{
    public static int divisible(int[] arr, int k){
        int c=0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum%k==0){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k =5;
        System.out.println(divisible(arr,k));
    }
}
