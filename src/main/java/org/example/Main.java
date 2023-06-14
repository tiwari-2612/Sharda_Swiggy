package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(" WElcome to sharda Swiggy delivery app");


        // Validate user credentials

            // Display menu options
            Scanner sc = new Scanner(System.in);
            System.out.println("Select your Food Type:");
        System.out.println("Veg for Vegetarian food");
        System.out.println("Non Veg for Non Vegetarian food");
            String dish = sc.nextLine();
            if (dish.equalsIgnoreCase("Veg")) {
                System.out.println("Here's the List of Some Famous Restaurants:");
                info("C:\\Users\\uttu3\\OneDrive\\Desktop\\VegMenu.csv");
            } else if (dish.equalsIgnoreCase("Non veg")) {
                System.out.println("Here's the List of Some Famous Restaurants:");
                info("C:\\Users\\uttu3\\OneDrive\\Desktop\\Nonveg.csv");
            }

            // Process the user's choice

        }
        private static void info (String filePath){

            String line = "";
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                while ((line = reader.readLine()) != null) {
                    String[] row = line.split(",");
                    for (String i : row) {
                        System.out.printf("%-30s", i);
                    }
                    System.out.println();
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);


            }

        }


    }

