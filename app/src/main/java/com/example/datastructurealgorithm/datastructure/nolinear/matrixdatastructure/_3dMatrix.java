package com.example.datastructurealgorithm.datastructure.nolinear.matrixdatastructure;

import java.util.Scanner;

public class _3dMatrix {
    final int planesCount;
    final int rowsCount;
    final int columnsCount;

    public final int[][][] matrix;

    public _3dMatrix(int planes, int rows, int columns) {
        this.planesCount = planes;
        this.rowsCount = rows;
        this.columnsCount = columns;
        matrix = new int[planes][rows][columns];
    }

    public void addData() {
        Scanner scanner = new Scanner(System.in);
        for (int plane = 0; plane < planesCount; plane++) {
            for (int row = 0; row < rowsCount; row++) {
                for (int column = 0; column < columnsCount; column++) {
                    System.out.print("plane[" + plane + "] row[" + row + "] - column[" + column + "] : ");
                    matrix[plane][row][column] = scanner.nextInt();
                }
            }
        }
    }

    public void printData() {
        for (int[][] plane : matrix) {
            System.out.println("plane :" + plane);
            for (int[] row : plane) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }
}
