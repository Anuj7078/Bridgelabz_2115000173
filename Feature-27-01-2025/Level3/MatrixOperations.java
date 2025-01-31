import java.util.*;

public class MatrixOperations {

    public static void main(String[] args) {

        int[][] matrix1 = createRandomMatrix(3, 3);
        int[][] matrix2 = createRandomMatrix(3, 3);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("Addition of matrices:");
        int[][] sum = addMatrixes(matrix1, matrix2);
        displayMatrix(sum);

        System.out.println("Subtraction of matrices:");
        int[][] difference = subtractMatrices(matrix1, matrix2);
        displayMatrix(difference);

        System.out.println("Multiplication of matrices:");
        int[][] product = multiplyMatrices(matrix1, matrix2);
        displayMatrix(product);

        System.out.println("Transpose of Matrix 1:");
        int[][] transpose = transposeMatrix(matrix1);
        displayMatrix(transpose);

        int[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("Determinant of 2x2 matrix:");
        int determinant2x2 = determinant2x2(matrix2x2);
        System.out.println(determinant2x2);

        System.out.println("Determinant of 3x3 matrix:");
        int determinant3x3 = determinant3x3(matrix1);
        System.out.println(determinant3x3);

        System.out.println("Inverse of 2x2 matrix:");
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        displayMatrix(inverse2x2);

        System.out.println("\nInverse of 3x3 matrix:");
        double[][] inverse3x3 = inverse3x3(matrix1);
        displayMatrix(inverse3x3);
    }

    public static int[][] createRandomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    public static int[][] addMatrixes(int[][] matrix1, int[][] matrix2) {
        int r = matrix1.length;
        int c = matrix1[0].length;
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return ans;
    }

    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int r = matrix1.length;
        int c = matrix1[0].length;
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return ans;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int r = matrix1.length;
        int c = matrix2[0].length;
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    ans[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return ans;
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static int determinant2x2(int[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / det;
        inverse[0][1] = (double) -matrix[0][1] / det;
        inverse[1][0] = (double) -matrix[1][0] / det;
        inverse[1][1] = (double) matrix[0][0] / det;
        return inverse;
    }

    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            return null;
        }
        double[][] adj = new double[3][3];
        adj[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        adj[0][1] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        adj[0][2] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        adj[1][0] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        adj[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        adj[1][2] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        adj[2][0] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        adj[2][1] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        adj[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[i][j] / det;
            }
        }
        return inverse;
    }

    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%.2f ", matrix[i][j]));
            }
            System.out.println();
        }
    }
}
