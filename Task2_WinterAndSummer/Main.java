package com.company;

public class Main {

    public static void main(String[] args) {

        WinterSummerCounter wsc =new WinterSummerCounter();
        int tempr []=new int[]{5, -2, 3, 5, 6};//4
//        int tempr []=new int[]{-2, 3,  8};//1
//        int tempr []=new int[]{ -5, -5, -5, -42, 6, 12};//4
//        int tempr []=new int[]{-2, 3};//1
        System.out.println("result= "+wsc.Solution(tempr));
    }
}
