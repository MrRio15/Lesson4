import java.util.Scanner;
public class L5_T7 {
    public static void main(String[] args) {
        System.out.print("Array length is ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i=0; i<length; i++) {
            System.out.println("Enter "+(i+1)+" element of array");
            array[i] = scanner.nextInt();
        }
        for (int i=0; i<length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
