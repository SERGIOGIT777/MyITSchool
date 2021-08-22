package Lesson.Student10.src.com.serg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Car car1 = new Car();
	Car car2 = new Car("Audi");
	Car car3 = new Car("Black", "Audi");

	car1.info();
	car2.info();
	car3.info();

	 */

	/*System.out.println("Car1 - Constructor");
	Car car1 = new Car();
	System.out.println("Car2 - Constructor");
	Car car2 = new Car("Audi");
	System.out.println("Car3 - Constructor");
	Car car3 = new Car("Black", "Audi");

	System.out.println("Test - Car1");
	System.out.println("Car1 - Model" + car1.getModel());
	System.out.println("Car1 - Color" + car1.getColor());
	car1.setColor("Red");
	car1.setModel("Sckoda");
	car1.info();

	System.out.println("Test - Car2");
	System.out.println("Car2 - Model" + car2.getModel());
	System.out.println("Car2 - Color" + car2.getColor());
	car2.setColor("Red");
	car2.setModel("Sckoda");
	car2.info();

	System.out.println("Test - Car3");
	System.out.println("Car3 - Model" + car3.getModel());
	System.out.println("Car3 - Color" + car3.getColor());
	car3.setColor("Red");
	car3.setModel("Sckoda");
	car3.info();

	 */

		///----блок try catch------

		/*
		try {
			int[] mass = new int[3];
			mass[2] = 15;
			System.out.println(mass[2]);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Блок finally");
		}
		System.out.println("Программа завершена");


		 */

		/*int [] mass = new int [3];
		try {
			mass[6] = 15;
			mass[6] = Integer.parseInt("varet");
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Выход за пределы массива");
		}
		catch (NumberFormatException ex) {
			System.out.println("Ошибка преобразования из строки в число");
		}

		 */


		/*System.out.println("Введите число меньше 30");
		try {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			if (a >= 30) {
				throw new Exception("Число а должно быть меньше 30");
			}
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Программа завершена!!");

		 */

		//---------------рекурсивные функции----------


		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println(fact(n));
		System.out.println(factorial(n));

		 */
		System.out.print(factorial(15));
		}

	private static int fact(int n){
		if (n < 0) {
			System.out.println("Факториал отрицательного числа не считается");
			return 0;
		}
		int result = 1;
		for (int i = 1; i <=n; i++) {
			result = result*i;
		}
		return result;
	}

	private static int factorial(int n) {
    	int result = 1;
    	if (n == 0) {
    		System.out.print(" = ");
    		return result;
		}
		if (n == 1) {
			System.out.print(" = ");
			return result;
		}
		System.out.print(n);
		if (n!=2) System.out.print(" * ");

		if (n <0) {
			System.out.print("ERROR");
			return 0;
		}
    	result = n*factorial(n-1);
    	return result;
	}
}
