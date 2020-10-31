package com.company;

import java.util.Random;
/*
 Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.
 */
class StopWatch_test {
    public static void main(String[] args) {
        Stopwatch sure = new Stopwatch();
        int[] array= new int[100_000]; //100_000 eleman icin dizi olusturalim
        Random random_number= new Random(); //random number olusturmak icin object olusturalim.
        for (int i = 0; i <array.length ; i++) {
            array[i]= random_number.nextInt(100_000); //olusturma siniri
        }
        sure.getStartTime();
        java.util.Arrays.sort(array);
        sure.getEndTime();
        long timePassed= sure.getElapsedTime();
        System.out.println("Time passed: " + timePassed + " miliseconds which makes "+ ((double)(timePassed))/1000 + " seconds");
    }
}