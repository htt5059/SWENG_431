package com.company;

import com.company.Part1.part1;
import com.company.Part2.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        //part 1:
        part1 p1= new part1();
        p1.part1();

        //part 2:
        part2 p2=new part2();
        p2.part2();
         */
        boolean check=false;
        double x= Math.random()*12-6;
        double y= Math.random()*10-5;
        double newx=0, newy=0;

        while(check==false){
            //x loop
            for(int i=0; i<2000; i++){
                //f=dz/dx
                double f=4*Math.pow(x,3)-y-1;
                //newf= d^2 z/dx^2;
                double newf=12*Math.pow(x,2);
                newx= x-f/newf;
                double a=4*Math.pow(newx,3)-y-1;
                if((newx<=6 && newx>=-6) && (Math.abs(x-newx)<0.000001)) {
                    break;
                }
                x=newx;
            }
            //y loop
            for(int j=0; j<2000; j++){
                //f=dz/dy
                double f=12*Math.pow(y,5)-x;
                //newf= d^2 z/dy^2;
                double newf=60*Math.pow(y,4);
                newy= y-f/newf;
                if((newy<=5 && newy>=-5) && (Math.abs(y-newy)<0.000001)) {
                    break;
                }
                y=newy;
            }
            x=newx; y=newy;
            double fx=4*Math.pow(x,3)-y-1;
            double fy=12*Math.pow(y,5)-x;
            if(fx<0.000001 && fy<0.000001){
                check=true;
            }
        }
        System.out.println("x,y: "+newx+", "+newy);
        double fx=4*Math.pow(x,3)-y-1;
        double fy=12*Math.pow(y,5)-x;
        System.out.println(fx+"     "+fy);
        double z=Math.pow(newx,4)+2*Math.pow(newy,6)-newx*newy+2;
        System.out.println("z: "+z);


    }

    public static void QuickSort(int[] arr, int l, int r){
        if(l<r) {
            int s = partition(arr, l, r);
            QuickSort(arr, l, s - 1);
            QuickSort(arr, s + 1, r);
        }
    }
    public static int partition(int arr[], int l, int r){
        int p=arr[r], i=l-1, j=r;
        while(i<j){
            do i=i+1;
                while(arr[i]>p);
            do j=j-1;
                while(j>= 0 &&arr[j] <= p);
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            else{
                int temp=arr[r];
                arr[r]=arr[i];
                arr[i]=temp;
            }
        }
        return i;
    }
}


class Ceremony{
    public CubScout cs;
    public void getA(CubScout c){
        if(c instanceof Tiger){
            cs.provide();
        }
    }
    public void getB(CubScout c){
        if(c instanceof Bear){
            cs.provide();
        }
    }
}

interface CubScout{
    void provide();
}

class Tiger implements CubScout{
    private String name;
    private boolean hasAward= false;
    Tiger(){
        name="Tiger";
    }
    public String getName(){return name;}
    public void provide(){
        hasAward=true;
    }
}

class Bear implements CubScout{
    private String name;
    private boolean hasAward= false;
    Bear(){
        name="Bear";
    }
    public String getName(){return name;}
    public void provide(){
        hasAward=true;
    }
}