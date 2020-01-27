package com.company;

public class Main {

    public static void main(String[] args) {
        //     int[] data = {5,7,6,5,7,8,9,4};
        double[] data = {5,7,6,5,7,8,9,4};
        for(int i = 0;i<data.length;i++){
            i++;
        }
        System.out.println("\n");
        System.out.println("Jumlah Bilangan  = " +nilai(data));
        System.out.println("Rata - Rata      = " +rata(data));
        System.out.println("Standar Deviasi  = " +sd(data));
        System.out.println("\n");
    }

    public static int nilai(double [] data){
        int result = 0;
        for (int i = 0 ; i < data.length ; i++){
            result += data[i];
        }
        return result;
    }
    public static int rata(double [] data){
        return nilai(data)/data.length;
    }
    public static double sd (double [] data){
        double rata = rata(data);
        double a = 0;
        for (int i=0;i<data.length;i++){
            a +=  Math.sqrt(Math.pow(data[i] - rata,2))/(data.length-1);
        }
        return a;
    }
}
