package HomeWork.HomeWork10.src.com.serg2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число = ");
        double a = sc.nextInt();

        Matrix mass = new Matrix(4, 4);
        mass.kol();
        mass.fillRandom();
        mass.print("A (рандомная матрица)");

        Matrix mass1 = new Matrix(4,4);
        mass1.fillRandom();
        mass1.print("B (рандомная матрица)");

        Matrix mass2 = mass.sum(mass1);
        mass2.print("C = A + B (сложение матриц)");

        Matrix mass3 = mass2.multiply(a);
        mass3.print("D = C * a (умножение матрицы на число)");

        Matrix mass4 = mass2.multiply(mass3);
        mass4.print("E = C * D (умножение матриц)");
    }
}
