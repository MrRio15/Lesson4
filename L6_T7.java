import java.util.Scanner;
public class L6_T7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = scanner.nextInt();
        int[] arr = array(size);
        print(arr);
    }

    /**
     * Создает массив заданного размера и принимает в него пользовательские значения элементов
     *
     * @param size размер массива
     * @return новый массив с элементами, заданными пользователем
     */
    static int[] array(int size){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            System.out.println("Enter "+(i+1)+" element");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    /**
     * Вывод введенного массива на печать
     *
     * @param arr массив для печати
     */
    static void print(int[] arr) {
        for (int i=0; i<(arr.length); i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
