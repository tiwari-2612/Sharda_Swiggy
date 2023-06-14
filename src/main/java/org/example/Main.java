package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Sharda Swiggy Delivery App");

        // Validate user credentials

        // Display menu options
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your Food Type:");
        System.out.println("1. Vegetarian food");
        System.out.println("2. Non Vegetarian food");
        System.out.println("3. Chinese");
        int dish = scanner.nextInt();

        if (dish==1) {
            System.out.println("Here's the List of Dishes we offer");
            displayMenu("C:\\Users\\uttu3\\OneDrive\\Desktop\\VegMenu.csv");
        } else if (dish==2) {
            System.out.println("Here's the List of Dishes we offer");
            displayMenu("C:\\Users\\uttu3\\OneDrive\\Desktop\\Nonveg.csv");
        } else if (dish==3) {
            System.out.println("Here's the List of Dishes we offer");
            displayMenu("C:\\Users\\uttu3\\OneDrive\\Desktop\\Chinese.csv");

        }
        else {
            System.out.println("Invalid choice!");
        }

        System.out.println("Do you want to Add Breads");
        System.out.println("Type Yes to continue, No otherwise");
        String disha = scanner.nextLine();

        if (disha.equalsIgnoreCase("Yes")) {
            displayMenu("C:\\Users\\uttu3\\OneDrive\\Desktop\\Bread.csv");
        }

        System.out.println("Do you want to Add Rice ");
        System.out.println("Type Yes to continue, No otherwise");
        String dishes = scanner.nextLine();

            if (dishes.equalsIgnoreCase("Yes"))
            {
                displayMenu("C:\\Users\\uttu3\\OneDrive\\Desktop\\Rice.csv");
            }

        System.out.println("Sweetness is the key to get people, Do you want some good sweet dishes in your menu");
        System.out.println("Type Yes to continue, No otherwise");
        String dishe = scanner.nextLine();
        if (dishe.equalsIgnoreCase("Yes"))
        {
            displayMenu("C:\\Users\\uttu3\\OneDrive\\Desktop\\Desert.csv");
        }





        scanner.close();
    }

    private static void displayMenu(String csvFilePath) {
        String line = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String item : row) {
                    System.out.printf("%-30s", item);
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Error reading the menu file: " + e.getMessage());
        }
    }
}
