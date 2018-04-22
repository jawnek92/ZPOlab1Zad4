package com.jawnek;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        draw(3, 5);
        System.out.println(" ");
        draw(1, 7);

    }

    private static void draw(int dlugosc, int zagniezdzenia){
        double odejmnik = pow(2.0, zagniezdzenia-1);
        if(zagniezdzenia > 0 ){
            for(int i=0; i<=dlugosc; i++){
                System.out.print('|');
                for(int j=0; j<(int)(odejmnik-1); j++){
                    System.out.print(" ");
                }
            }
            System.out.print('\n');
            draw(dlugosc*2, zagniezdzenia-1);
        }
    }
}
