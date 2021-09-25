import java.util.Scanner;
import java.util.Arrays;
public class L6_T8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] arr = array(size);
        System.out.println("Max="+max(arr)+" Min="+min(arr)+" Mean="+mid(arr)+" Median="+med(arr));
    }

    static int[] array(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static int max(int[] arr) {
        int num=arr[0];
        for (int i=1; i<arr.length; i++) {
            if (num<arr[i]) num=arr[i];
        }
        return num;
    }

    static int min(int[] arr) {
        int num=arr[0];
        for (int i=1; i<arr.length; i++) {
            if (num>arr[i]) num=arr[i];
        }
        return num;
    }

    static double mid(int[] arr) {
        int num=arr[0];
        for (int i=1; i< arr.length; i++) {
            num += arr[i];
        }
        return (num / (double)arr.length);
    }

    static int med(int[] arr) {
        Arrays.sort(arr);
        int mid = ((arr.length) / 2);
        if(arr.length % 2 == 0){
            int medianA = arr[mid];
            int medianB = arr[mid-1];
            return ((medianA + medianB) / 2);
        } else{
            return (arr[mid + 1]);
        }
    }
}
