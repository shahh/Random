package Euler;

import java.util.ArrayList;

public class Ex2 {
    public static void main(String args[]){
        int sum=0;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(2);
        for(int i=1;i<32;i++){
                int t=nums.get(i)+nums.get(i-1);
                nums.add(t);
                System.out.println(nums);

        }

        for ( int nm : nums )
            if(nm%2==0){
            sum+=nm;
            }
        System.out.println(sum);
    }

    }

