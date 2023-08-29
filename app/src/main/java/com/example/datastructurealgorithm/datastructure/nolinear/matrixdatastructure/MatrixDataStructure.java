package com.example.datastructurealgorithm.datastructure.nolinear.matrixdatastructure;

public class MatrixDataStructure {
    public static void main(String[] args) {

    }

    private void test2dMatrix() {
        //*  *  *  *
        //*  *  *  *
        //*  *  *  *
        _2dMatrix matrix = new _2dMatrix(3, 4);
        matrix.addData();
        matrix.printData();
    }

    private void test3dMatrix() {
        //plane 1
        //*  *  *  *
        //*  *  *  *
        //*  *  *  *

        //plane 2
        //*  *  *  *
        //*  *  *  *
        //*  *  *  *

        //plane 3
        //*  *  *  *
        //*  *  *  *
        //*  *  *  *
        _3dMatrix matrix = new _3dMatrix(3, 3, 4);
        matrix.addData();
        matrix.printData();
    }
}