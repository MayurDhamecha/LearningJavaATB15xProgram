package JAVA;

public class Lab0010_Three_By_Three_Matrix_Using_Array {
    public static void main (String[] args){
        int[][] three_by_three_matrix = {
                {1,2,3}, {4,5,6}, {7,8,9}
        };

        for (int i = 0; i < three_by_three_matrix.length; i++) {
            for (int j = 0; j < three_by_three_matrix[i].length; j++) {
                System.out.print(three_by_three_matrix[i][j] + "|");
            }
            System.out.println();
        }
    }
}