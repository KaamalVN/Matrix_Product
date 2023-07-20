import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int size2=scanner.nextInt();
        int[][] matrix = new int[size][size2];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int value = scanner.nextInt();
        System.out.println(Arrays.deepToString(matrix_product(matrix,value,size,size2)));
    }

    static int[][] matrix_product(int[][] matrix,int value,int size,int size2) {
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j]*=value;
            }
        }
        return  matrix;
    }
}
