import java.util.Scanner;
public class L5_T10 {
    public static void main(String[] args) {
        System.out.print("Number of strings is ");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        System.out.print("Number of columns is ");
        int col = scanner.nextInt();
        int[][] matrix = new int[str][col];
        matrix[0][0] = 1;
        for ( int i=0; i<col; i++) {
            for (int j=0; j<str; j++){
                if ((i == 0)&(j==0)) j++;
                if (j == 0) {
                    matrix[j][i] = matrix[str-1][i-1]+1;
                    j++;
                }
                matrix[j][i] = matrix[j-1][i]+1;
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
