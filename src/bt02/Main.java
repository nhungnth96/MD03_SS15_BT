package bt02;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int max1 = 0;
        int max2 = 0;
        int[] arr1 = {1,2,3};
        int[] arr = {};
        try {
           max2 = findMax(arr1);
            max1 = findMax(arr);

        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("max: "+max2);
        System.out.println("max: "+max1);
    }
    public static int findMax(int[] arr) throws Exception{
        if(arr.length==0) throw new Exception();
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
