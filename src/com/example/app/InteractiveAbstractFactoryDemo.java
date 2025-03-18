package com.example.app;

import com.example.app.client.Application;
import com.example.app.factory.DarkThemeFactory;
import com.example.app.factory.HighContrastThemeFactory;
import com.example.app.factory.LightThemeFactory;
import com.example.app.factory.TerminalThemeFactory;

import java.util.Scanner;

public class InteractiveAbstractFactoryDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Application currentApp;

        while (true) {
            System.out.println("\nChoose a theme to apply:");
            System.out.println("1. Light Theme");
            System.out.println("2. Dark Theme");
            System.out.println("3. High Contrast Theme");
            System.out.println("4. Terminal Theme");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    currentApp = new Application(new LightThemeFactory());
                    System.out.println("Applying Light Theme...");
                    break;
                case "2":
                    currentApp = new Application(new DarkThemeFactory());
                    System.out.println("Applying Dark Theme...");
                    break;
                case "3":
                    currentApp = new Application(new HighContrastThemeFactory());
                    System.out.println("Applying High Contrast Theme...");
                    break;
                case "4":
                    currentApp = new Application(new TerminalThemeFactory());
                    System.out.println("Applying Terminal Theme...");
                    break;
                case "5":
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            currentApp.render();
        }
    }

}
