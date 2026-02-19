package ru.zaurtregulov.javabeginning.lesson18;

public class Array {
    static void main(String[] args) {

//        Declaration
        int[] array1;
        String[] array2;
        Array[] array3;
        double[][] array4;
        int[][] array5;

//        Allocation
        array1 = new int[4];
        array2 = new String[3];
        array3 = new Array[2];
        array4 = new double[4][2];
        array5 = new int[3][];

//        Initialization
        array2[0] = "privet";
        array2[1] = "poka";
        array2[2] = "ok";
        array4[0][0] = 4.5;
        array4[0][1] = 6.7;

        double[] array6;
        array6 = new double[2];
        array6[0] = 2.5;
        array6[1] = 3.5;

        array4[1] = array6;
        System.out.println();
        System.out.println(array4[0][0]);
    }
}
