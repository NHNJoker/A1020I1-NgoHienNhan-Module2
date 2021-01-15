package lopVaDoiTuong;

import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (Math.pow(this.b, 2) - 4 * this.a * this.c);
    }

    public double getRoot() {
        return (-this.b / 2 * this.a);
    }

    public double getRoot1() {
        return (-this.b + Math.pow((Math.pow(this.b, 2) - 4 * this.a * this.c), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.pow((Math.pow(this.b, 2) - 4 * this.a * this.c), 0.5)) / 2 * this.a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = input.nextDouble();
        System.out.println("Nhap b:");
        double b = input.nextDouble();
        System.out.println("Nhap c:");
        double c = input.nextDouble();
        QuadraticEquation quadraticEquationObj = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquationObj.getDiscriminant());
        if (a == 0) {
            System.out.println("phuong trinh co 1 nghiem" + (-quadraticEquationObj.c / quadraticEquationObj.b));
        } else {
            if (quadraticEquationObj.getDiscriminant() > 0) {
                System.out.println("Phuong trình có hai nghiệm:" + quadraticEquationObj.getRoot1() + " va " +
                        quadraticEquationObj.getRoot2());
            } else if (quadraticEquationObj.getDiscriminant() == 0) {
                System.out.println("Phuong trình có 1 nghiệm:" + quadraticEquationObj.getRoot());
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}

