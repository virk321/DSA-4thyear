package day6;

public class jumpGame2{
    public static int game(int[] arr){
        int currEnd=0;
        int far=0;
        int j=0;

        for(int i=0; i<arr.length-1; i++){
            far = Math.max(far,i+arr[i]);

            if(i==currEnd){
                j++;
                currEnd=far;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,1,4};
        System.out.println(game(arr));
    }
}
