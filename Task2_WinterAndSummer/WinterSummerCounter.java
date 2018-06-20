package com.company;

public class WinterSummerCounter {
    public int Solution(int[] T){
        int length=T.length,result=0;
        int max_array[]=new int[length];
        int min_array[]=new int[length];
        int max=T[0];
        int min=T[length-1];
        for(int i=0;i<length;i++){
            if(max>T[i]){
                max_array[i]=max;
            }
            if(max<=T[i]) {
                max = T[i];
                max_array[i]=max;
            }
        }
        for(int i=length-1;i>=0;i--){
            if(T[i]<=min) {
                min = T[i];
                min_array[i]=min;
            }
            else
                min_array[i]=min;
        }

        for(int i=0;i<length-1;i++){
            if(max_array[i]>=min_array[i+1]){
                result++;
            }
            else break;
        }
        return result+1;
    }
}
