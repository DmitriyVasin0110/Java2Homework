package com.company.homework5;
import java.util.Arrays;

public class Main {
    public static final int SIZE = 10000000;
    public static final int H = SIZE / 2;
    public static final float[] ARR = new float[SIZE];

    public static void main(String[] args) {
        oneThread();
        twoThreads();
    }

    public static float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    public static void oneThread() {
        Arrays.fill(ARR, 1.0f);
        long a = System.currentTimeMillis();
        calculate(ARR);
        System.out.println("Время работы метода с одним потоком: " + (System.currentTimeMillis() - a));
        System.out.println(Arrays.toString(ARR));
    }

    public static void twoThreads() {
        Arrays.fill(ARR, 1.0f);
        float[] arr1 = new float[H];
        float[] arr2 = new float[H];
        long b = System.currentTimeMillis();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.arraycopy(ARR, 0, arr1, 0, H);
                calculate(arr1);
                System.arraycopy(arr1, 0, ARR, 0, H);
            }
        });
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
               System.arraycopy(ARR, H, arr2, 0, H);
                for (int j = 0, i = arr2.length; j < arr2.length; j++, i++) {
                    arr2[j] = (float) (arr2[j] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                System.arraycopy(arr2, 0, ARR, H, H);
            }
        });
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Время работы метода с двумя потоками: " + (System.currentTimeMillis()-b) );
    }
}