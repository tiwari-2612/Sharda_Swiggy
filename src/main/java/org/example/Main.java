package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (!validateCredentials()) {
            System.out.println("Invalid username or password. Exiting...");
            return;
        }
            else{

            System.out.println("Welcome to Sharda Swiggy Delivery App Mr. Utkarsh");
            System.out.println();

            // Display menu options
            Scanner scanner = new Scanner(System.in);
            System.out.println("Available Restaurants Choose from which you wanna enter");
            Restro.displayMenu("C:\\Users\\uttu3\\IdeaProjects\\ShardaSwiggy\\data\\Restro1.csv");
            int restro = scanner.nextInt();
            System.out.println();

            Dish.menu(restro);
            Dish.displayMenu("C:\\Users\\uttu3\\IdeaProjects\\ShardaSwiggy\\data\\Menu.csv");


            scanner.close();
        }
    }

    private static boolean validateCredentials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Perform username and password validation
        if (username.equals("Utkarsh") && password.equals("Tiwari")) {
            return true;
        } else {
            return false;
        }
    }
}

