package com.company.www.utils.matrixExample;

public class MatrixExample {

    /** Print a given matrix in spiral form. **/

    public void spiralMatrix(int[][] matrix) {
        int startRow = 0, endRow = matrix.length - 1, startColumn = 0, endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            for (int i = startColumn; i <= endColumn; ++i) System.out.print(matrix[startRow][i]);
            startRow++;
            for (int i = startRow; i <= endRow; ++i) System.out.print(matrix[i][endColumn]);
            endColumn--;
            if (startRow < endRow) {
                for (int i = endColumn; i >= startColumn; --i) System.out.print(matrix[endRow][i]);
                endRow--;
            }
            if (startColumn < endColumn) {
                for (int i = endRow; i >= startRow; --i) System.out.print(matrix[i][startColumn]);
                startColumn++;
            }
        }

    }

    /** Print the sum of perimeter elements of a given matrix . **/

    /**Shortest path in a Binary Maze**/
}
