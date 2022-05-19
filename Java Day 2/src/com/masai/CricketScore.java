package com.masai;

public class CricketScore {
    public static void totalRunScore(int o, int t, int th, int f, int s)
    {	
    	System.out.println("Total runs scored by Batsman are " + ((1*o)+(2*t)+(3*th)+(4*f)+(6*s)));
    }
 
    public static void main(String[] args)
    {
        int one_s = 10;
        int two_s = 3;
        int three_s = 5;
        int four_s = 8;
        int six_s = 6;
        totalRunScore(one_s,two_s,three_s,four_s,six_s);
    }
}
