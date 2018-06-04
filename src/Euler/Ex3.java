package Euler;

import java.util.ArrayList;

public class Ex3 {
    public static void main(String args[]){

        int num=15 ;
        ArrayList<Integer> nums = new ArrayList<Integer>();

        for(int i=2;i<=num;i++){
            while (num % i == 0) {
                nums.add(i);
                num /= i;
            }


        }

        System.out.println(nums);

    }

    }

