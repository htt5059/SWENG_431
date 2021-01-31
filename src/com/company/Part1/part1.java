package com.company.Part1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class part1 {
    public static void part1() {
        Scanner in = new Scanner(System.in);
        int[] coef = new int[7];
        int i = 0;
        while (i < 7) {
            coef[i] = in.nextInt();
            i++;
        }
        //f(x)= ax^6 - bx^5 + cx^4 - dx^3 + ex^2 - fx + g=0
        in.close();
        ArrayList<Double> roots= new ArrayList<>();
        boolean hasRoot = false;
        int count=0;
        while(count<6){
            double x = Math.random()*(2000)-1000;
            System.out.println("x: "+x);
            for (i = 0; i < 2000; i++) {
                //newx = x - f(x)/f'(x)
                double f = (coef[0] * Math.pow(x, 6) - coef[1] * Math.pow(x, 5) + coef[2] * Math.pow(x, 4) - coef[3] * Math.pow(x, 3)
                        + coef[4] * Math.pow(x, 2) - coef[5] * x + coef[6]);
                double newf = (6 * coef[0] * Math.pow(x, 5) - 5 * coef[1] * Math.pow(x, 4)
                        + 4 * coef[2] * Math.pow(x, 3) - 3 * coef[3] * Math.pow(x, 2) + 2 * coef[4] * x - coef[5]);
                double newx = x - f / newf;
                if (Math.abs(x - newx) < 0.000001) {
                    hasRoot = true;
                    x=Math.round(x*1000)/1000;
                    if(!roots.contains(x))
                        roots.add(x);
                    break;
                }
                x = newx;
            }
            count++;
        }

        if (hasRoot) {
            for(i=0; i<roots.size(); i++){
                System.out.println("The root is " + roots.get(i));
            }
        } else System.out.println("Not Found!");
    }
}
