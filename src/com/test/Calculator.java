package com.test;
import java.util.InputMismatchException;
import java.util.Scanner;



public class Calculator {
    public static void main(String args[]) throws java.io.IOException {
        int a = 0, b = 0;
        int choice;
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Введите первое число:");
                a = (int) sc.nextInt();
            }
            catch(InputMismatchException exc) {
                System.out.print("\"" +sc.nextLine() + "\" не является числом" + "\n");
                continue;
            }
            do {
                System.out.print("Выберете желаемое действие:");
                System.out.print("1 - Сложение\t5 - Остаток от деления\n2 - Вычитание\n3 - Умножение\t7 - Возведение в степень\n4 - Деление");
                choice = (int) sc.nextInt();
                switch(choice) {
                    case 1 :
                    case 2 :
                    case 3 :
                    case 4 :
                    case 5 :
                        try {
                            System.out.print("Введите второе число:");
                            b = (int) sc.nextInt();
                        }
                        catch(InputMismatchException exc) {
                            System.out.print("\"" +sc.nextLine() + "\" не является числом" + "\n");
                            continue;
                        }
                        if(choice == 1) {
                            System.out.print(a + " + " + b + " = " + (a + b) + "\n");
                        }
                        else if(choice == 2) {
                            System.out.println(a + " - " + b + " = " + (a - b) + "\n");
                        }
                        else if(choice == 3) {
                            System.out.print(a + " * " + b + " = " + (a * b) + "\n");
                        }
                        else if(choice == 4) {
                            if (Double.isInfinite(a/b)) {
                                System.out.print("Деление на 0! \n");
                            }
                            else {
                                System.out.print(a + " / " + b + " = " + (a / b) + "\n");
                            }
                        }
                        else if(choice == 5) {
                            if (Double.isNaN(a%b)) {
                                System.out.print("Деление на 0! \n");
                            }
                            else {
                                System.out.print(a + " % " + b + " = " + (a % b) + "\n");
                            }
                        }
                        break;

                    case 7 :
                        try {
                            System.out.println("Укажите степень числа " + a);
                            b = (int) sc.nextInt();
                        }
                        catch(InputMismatchException exc) {
                            System.out.print("\"" +sc.nextLine() + "\" не является степенью числа " + a + "\n");
                            continue;
                        }
                        System.out.print(a + " в степени " + b + " = " + Math.pow(a, b) + "\n");
                        break;
                    default :
                        System.out.print("Выбор неверный! ");
                        break;
                }
            } while(choice < 1 | choice > 6);
        }
    }
}
