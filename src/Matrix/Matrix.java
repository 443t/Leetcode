package Matrix;

public class Matrix {
    public static int[][] foo(int[][] arr) {

        for (int j = 3; j >= 0; j--) {
            for (int i = 2; i >= 0; i--) {


                if (arr[i + 1][j] > 0) {

                    if (arr[i + 1][j] == arr[i][j]) {

                        arr[i][j] = arr[i][j] * 2;
                        arr[i + 1][j] = 0;
                    }
                    if (arr[i][j] == 0) {
                        arr[i][j] = arr[i + 1][j];
                        arr[i + 1][j] = 0;
                    }

                    for (int p = 0; p < 4; p++) {
                        for (int m = 0; m < 4; m++) {
                            System.out.print(arr[p][m] + " ");
                        }
                        System.out.println(" ");

                    }
                    System.out.println(" ");
                }
            }
        }


        return arr;
    }

    public static void main(String args[]) {


        int[][] matrix = {{2, 0, 2, 0},
                {2, 0, 2, 0},
                {0, 3, 0, 1},
                {0, 3, 1, 1}};

        matrix = foo(matrix);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");

        }

    }
}
