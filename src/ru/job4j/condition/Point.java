package ru.job4j.condition;

import java.util.Scanner;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1),2));

        return rsl;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую точку по X ");
        int x1 = in.nextInt();
        System.out.print("Введите первую точку по Y ");
        int y1 = in.nextInt();

        System.out.print("Введите вторую точку по X ");
        int x2 = in.nextInt();
        System.out.print("Введите вторую точку по Y ");
        int y2 = in.nextInt();
        in.close();

        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + result);
    }
}