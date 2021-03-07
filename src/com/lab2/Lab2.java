package com.lab2;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите 3 координаты: ");
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Point3d Object1 = new Point3d(x, y, z);
        System.out.print("Введите 3 координаты: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d Object2 = new Point3d(x, y, z);
        System.out.print("Введите 3 координаты: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Point3d Object3 = new Point3d(x, y, z);
        if (Point3d.comparison(Object1,Object2) ||
                Point3d.comparison(Object2,Object3) ||
                Point3d.comparison(Object1,Object3))
            System.out.print("Одна из точек равна другой.");
        else System.out.print("Площадь треугольника: " + computeArea(Object1, Object2, Object3));
    }
    public static double computeArea(Point3d a, Point3d b, Point3d c) {
        double ab = a.distanceTo(b);
        double ac = a.distanceTo(c);
        double bc = c.distanceTo(b);
        double p = (ab + ac + bc) / 2;
        return Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
    }
}
