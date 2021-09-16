import java.util.*;
public class Sort {
    public static void main(String[] args) {
        int[] intArr = new int[100];
        for(int i = 0; i < intArr.length; i ++) {
            intArr[i] = (int)Math.floor(Math.random()*500);
        }
        intArr = sortInts(intArr);
        for(int i = 0; i < intArr.length; i ++) {
            System.out.print(intArr[i] + ", ");
        }
    }
    public static int[] sortInts(int[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr.length; j ++) {
                if(arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}