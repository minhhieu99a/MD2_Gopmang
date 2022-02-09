package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] array1 ={1,5,2,6,4};
        int [] array2 = {1,7,2,45,6};
        int [] array3 =mergeArray(array1,array2);
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
    public static int [] mergeArray(int[] a1,int []a2){
        int [] a3 =new int[a1.length+ a2.length];
        for (int i = 0; i < a1.length; i++) {
            a3[i]=a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            a3[a1.length+i]=a2[i];
        }
        return a3;
    }
}
