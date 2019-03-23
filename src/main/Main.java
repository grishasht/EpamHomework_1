package main;

import Task1.Task1;
import Task2.Task2;
import Task3.Task3;
import Task4.Task4;
import Task5.Task5;

import java.util.Scanner;

//import common.common;
//
//package ua.com.prologistic;
//
//public class Memory{
//
//    public static void main(String[] args){
//        int i = 1;
//        Object object = new Object();
//        Memory memory = new Memory();
//        memory.exMethod(object);
//    }
//
//    private void exMethod(Object param){
//        String string = param.toString();
//        System.out.println(string);
//    }
//}


/*
class Homework{

    Homework(){

    }

    public int getNumber(){
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String strNumber = null;
        try {
            strNumber = buffer.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int number = 0;
        if (strNumber.charAt(0) == '0')
            for(int i = strNumber.length()-1, degree = 0; i >= 1 ; i--, degree++) {
                char tmp = strNumber.charAt(i);
                if (tmp == '1') {
                    number += Math.pow(2, degree);
                }
            }
        if (strNumber.charAt(0) == '1') {
            number = -1;
            for (int i = strNumber.length() - 1, degree = 0; i >= 1; i--, degree++) {
                char tmp = strNumber.charAt(i);
                if (tmp == '0') {
                    number -= Math.pow(2, degree);
                }
            }
        }

        return number;
    }

    public int invertNumber(int number){
        return number % 2 != 0 ? ~number^1 : ~--number;
    }

    public String getTypeValue(long number){
        int i = 1;
        if (number < 0) {
            number = ~--number;
           // i = 0;
            number--;
        }

        //System.out.print("Binary form of your number: " + Long.toBinaryString(number) + " -> ");
        while(Math.abs(number) > 0){
        //    System.out.printf("%d -> ", number);
            number = number >>> 1;
            i++;
        }
        //System.out.println("\nThe i value: " + i);
        float tmp = i/8f;
        //System.out.println("The tmp value: " + tmp);

        if (tmp <= 1) return "Type of this number is byte (1 byte)";
        if (tmp <= 2) return "Type of this number is short (2 bytes)";
        if (tmp <= 4) return "Type of this number is int (4 bytes)";
        if (tmp <= 8) return "Type of this number is long (8 bytes)";
        return "Unknown type";
    }

    public int euklidianAlg(int firstNumber, int secondNumber) {
        int shift;
        if (firstNumber == 0) return secondNumber;
        if (secondNumber == 0) return firstNumber;

        for (shift = 0; ((firstNumber | secondNumber) & 1) == 0; ++shift) {
            firstNumber >>= 1;
            secondNumber >>= 1;
        }

        while ((firstNumber & 1) == 0)
            firstNumber >>= 1;
            do {
                while ((secondNumber & 1) == 0)
                    secondNumber >>= 1;
                if (firstNumber > secondNumber) {
                    int t = secondNumber;
                    secondNumber = firstNumber;
                    firstNumber = t;
                }
                secondNumber = secondNumber - firstNumber;
            } while (secondNumber != 0);
        return firstNumber << shift;
    }

    public int changeDigit(int number, int digitNumber){
        if (digitNumber > 32) return 0;
        int one = 1;
        one <<= digitNumber-1;

        return number ^ one;
    }

}
*/
public class Main {
    public static void main(String[] args){
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        Task5 task5 = new Task5();
        Scanner scanner = new Scanner(System.in);

        //Task1
        System.out.println("Task #1: Enter number in binary form: ");
        int decimalNumber = task1.getNumber();
        System.out.println("Output number: " + decimalNumber + "\n");

        //Task2
        System.out.println("Task #2: Enter number you want to make negative: ");
        System.out.println("Negative number: " + task2.invertNumber(scanner.nextInt()) + "\n");

        //Task3
        System.out.println("Task #3: Enter value and get its type: ");
        System.out.println(task3.getTypeValue(scanner.nextInt()));

        //Task4
        System.out.println("\nTask #4: Enter 2 numbers and get its greatest divisor: ");
        System.out.println("Greatest common divisor: " + task4.euklidianAlg(scanner.nextInt(), scanner.nextInt()));

        //Task5
        System.out.println("\nTask #5: Enter number and position of it you want to change: ");
        int inputNum = scanner.nextInt();
        int temp = task5.changeDigit(inputNum, scanner.nextInt());
        System.out.println("Input number binary form: " + Integer.toBinaryString(inputNum) + "\nGot out number: "
                + temp + "\nAnd its binary form: " + Integer.toBinaryString(temp));
    }
}
