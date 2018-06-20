package com.company;

public class WholeSquareCount {

    public int Solution(int A, int B){
        int result=0;
        if(A>B) throw new IllegalArgumentException("A must be less than or equal to B");
        if(A<0&&B>=0){
            return (int)Math.floor(Math.sqrt(B))+1;
        }
        if(A>=0&&B>=0){
            int  sqrtA =(int)Math.ceil(Math.sqrt(A));
            int  sqrtB=(int)Math.floor(Math.sqrt(B));
            result=sqrtB-sqrtA+1;
        }
        return result;
    }

}
