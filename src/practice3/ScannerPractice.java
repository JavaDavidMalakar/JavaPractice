package practice3;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scanner.next();
        System.out.println("Welcome to Michigan Ms." + name);


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter your city:");
        String city = scanner1.next();
        System.out.println("Welcome to lake city of" +city);

    }
}
