import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of first matrix :");
        int row1 = s.nextInt();
        int col1 = s.nextInt();
        System.out.println("Enter number of rows and columns of second matrix :");
        int row2 = s.nextInt();
        int col2 = s.nextInt();

        if(col1 != row2){
            System.out.println("Multiplication not possible!");
            s.close();
            return;
        }
        int[][] matrix1 = new int[row1][col1];
        int[][] matrix2 = new int[row2][col2];
        int[][] result = new int[row1][col2];
        
        System.out.println("Enter the elements of first matrix :");
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col1; j++)
                matrix1[i][j] = s.nextInt();
        }
        System.out.println("Enter the elements of second matrix :");
        for(int i = 0; i < row2; i++){
            for(int j = 0; j < col2; j++)
                matrix2[i][j] = s.nextInt();
        }
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                for(int k = 0; k < col1; k++){
                    result[i][j] += matrix1[i][k] * matrix2[k][j]; 
                }
            }
        }

        System.out.println("resultant matrix :\n");
        for(int i = 0; i < row1; i++){
            for(int j = 0; j < col2; j++){
                System.out.print("\t"+result[i][j]);
            }
            System.err.println();
        }
        s.close();
    }
}
