package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here

        Scanner scan = new Scanner(System.in);

        float largestNumber = 0;

        System.out.print("Number 1: ");
        float firstNumber = scan.nextFloat();

        if (firstNumber <= 0) {
            System.out.println("No number entered.");
        }
        else if (firstNumber > 0) {
            for (int x = 2; ; x = x + 1) {
                System.out.print("Number " + x + ": ");
                float number = scan.nextFloat();
                if (number > largestNumber) {
                    largestNumber = number;
                }
                if (number <= 0) {
                    break;
                }
            }
            String str = String.format("The largest number is %.2f", largestNumber);
            System.out.println(str);
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here

        Scanner scan = new Scanner(System.in);

        System.out.print("n: ");
        int n = scan.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number!");
        }

        int x = 0;

        for (int row = 0; row < n; row = row + 1) {
            for (int column = 0; column <= row; column = column + 1) {
                x = x + 1;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here

        final int Line = 6;
        int row;
        int column;

        for (row = 1; row <= Line; row = row + 1) {
            for (column = Line; column > row; column = column - 1) {
                System.out.print(" ");
            }
            for (column = 0; column < row * 2 - 1; column = column + 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here

        Scanner scan = new Scanner(System.in);

        System.out.print("h: ");
        int h = scan.nextInt();
        System.out.print("c: ");
        char c = scan.next().charAt(0);

        if (h % 2 == 1) {
            // upper half
            for (int row = 0; row <= h / 2; row = row + 1) {
                for (int spaces = row; spaces < h / 2; spaces = spaces + 1) {
                    System.out.print(" ");
                }
                for (int difference = 0 - row; difference <= row; difference = difference + 1) {
                    System.out.print((char)(c - Math.abs(difference)));
                }
                System.out.println();
            }
            // lower half
            for (int row = h / 2; row > 0; row = row - 1) {
                for (int rowForSpaces = row; rowForSpaces <= h / 2; rowForSpaces = rowForSpaces + 1) {
                    System.out.print(" ");
                }
                for (int difference = 0 - row + 1; difference < row; difference = difference + 1) {
                    System.out.print((char)(c - Math.abs(difference)));
                }
                System.out.println();
            }
        }
        else if (h % 2 == 0) {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here

        Scanner scan = new Scanner(System.in);

        float numberOfMarks = 0;
        float sumOfMarks = 0;
        int negativeMarks = 0;

        for (int x = 1; ; x = x + 1) {
            System.out.print("Mark " + x + ": ");
            int mark = scan.nextInt();

            if (mark > 5) {
                System.out.println("Invalid mark!");
                x = x - 1;
            }
            if (mark >= 1 && mark <= 5) {
                numberOfMarks = numberOfMarks + 1;
                sumOfMarks = sumOfMarks + mark;
            }
            if (mark == 5) {
                negativeMarks = negativeMarks + 1;
            }
            if (mark == 0) {
                break;
            }
        }
        if (numberOfMarks != 0) {
            float mean = sumOfMarks / numberOfMarks;
            String str = String.format("Average: %.2f", mean);
            System.out.println(str);
        }
        else if (numberOfMarks == 0) {
            System.out.println("Average: 0.00");
        }
        System.out.println("Negative marks: " + negativeMarks);
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        System.out.print("n: ");
        int n = scan.nextInt();

        while (n != 1 && n != 4) {
            while (n != 0) {
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1) {
            System.out.println("Happy number!");
        }
        else {
            System.out.println("Sad number!");
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}