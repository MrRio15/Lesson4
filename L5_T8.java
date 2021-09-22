import java.util.Scanner;
public class L5_T8 {
    public static void main(String[] args) {
        System.out.print("Number of strings is ");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        System.out.print("Number of columns is ");
        int col = scanner.nextInt();
        int[][] matrix = new int[str][col];
        for (int i=0; i<str; i++){
            for (int j=0; j<col; j++){
                System.out.println("Enter "+(i+1)+" "+(j+1)+" element");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Your matrix");
        for (int i=0; i<str; i++) {
            for (int j=0; j<col; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
