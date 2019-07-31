package lesson5.homework;

import java.text.DateFormat;
import java.util.Arrays;

public class MultiThreads {
    static final int size = 10000000; //Размер массива
    static final int n = 5;           //Кол-во потоков
    static final int h = size / n;    //длина фрагмента массива


    private static void calc(float[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }

    private static void method3(float[] arr) throws InterruptedException {
        long a = System.currentTimeMillis();
        String d = DateFormat.getTimeInstance().format(a);
        float[][] az = new float[n][];
        int elem = 0;
        Thread[] mass = new Thread[n];

        System.out.println("Время начала выполния: " + d);
        for (int z = 0; z < n; z++ ) {
            az[z] = new float[h];
            System.arraycopy(arr, elem, az[z], 0, h);
            elem=elem+h;
            int finalZ = z;
            mass[finalZ] = new Thread(new Runnable() {
                @Override
                public void run() { calc(az[finalZ]); }
            });
            mass[finalZ].start();
        }
        for (int z = 0; z < n; z++ ) {
            mass[z].join();
        }
        elem = 0;
        for (int z = 0; z < n; z++ ) {
            System.arraycopy(az[z], 0, arr, elem, h);
            elem=elem+h;
        }
        System.out.println("Время выполнения: " + (System.currentTimeMillis() - a) + " мс");

    }

    public static void main(String[] args) throws InterruptedException {

        float[] arr = new float[size];

        Arrays.fill(arr, 1);

        method3(arr);

    }
}
