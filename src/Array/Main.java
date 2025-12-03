package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        arreyss arr=new arreyss();;
           int []number={2,1,4,6,3,7,0};
           Arrays.sort(number);

          // int []number2=new int[5];
        number[2]=7;
        arr.dalet(number,2);
        arr.updata(number,3,7);
        arr.tre(number);
        arr.shiftLaft_daleet(number,2);
        arr.shiftRight_delete(number,2);
}}
