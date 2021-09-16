public class Sort {
    public static void main(String[] args) {
        int[] intArr = new int[100];
        for(int i = 0; i < intArr.length; i ++) {
            intArr[i] = (int)Math.floor(Math.random()*500);
        }
        char[] charArr = new char[100];
        for(int i = 0; i < charArr.length; i ++) {
            charArr[i] = (char)Math.floor(Math.random()*(91 - 65)+65);
        }
        intArr = sortInts(intArr);
        charArr = sortChars(charArr);
        for(int i = 0; i < intArr.length; i ++) {
            System.out.print(intArr[i] + ", ");
        }
        System.out.println();
        for(int i = 0; i < charArr.length; i ++) {
            System.out.print(charArr[i] + ", ");
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
    public static char[] sortChars(char[] arr) {
        for(int i = 0; i < arr.length; i ++) {
            for(int j = 0; j < arr.length; j ++) {
                if(arr[i] < arr[j]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}