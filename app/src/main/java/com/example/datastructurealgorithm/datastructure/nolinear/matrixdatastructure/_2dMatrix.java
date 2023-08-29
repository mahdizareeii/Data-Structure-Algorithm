package com.example.datastructurealgorithm.datastructure.nolinear.matrixdatastructure;

import java.util.Scanner;

public class _2dMatrix {

    final int rowSize;
    final int columnSize;
    public final int[][] matrix;

    public _2dMatrix(int row, int column) {
        this.rowSize = row;
        this.columnSize = column;
        matrix = new int[row][column];
    }

    public void addData() {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                System.out.print("row[" + row + "] - column[" + column + "] : ");
                matrix[row][column] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public void printData() {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(" " + value);
            }
            System.out.println();
        }
    }
}