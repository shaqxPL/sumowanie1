package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Oto rezultat metody sumowanie: " + sumowanie(1,3,5));

    }


        public static int sumowanie(int... liczby){
        int sum = 0;
        for(int x: liczby){
            sum = sum + x;
        }
        return sum;
    }
}
