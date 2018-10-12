package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        String userResponse = "";
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> drinks = new ArrayList<>();
        colors.add("red");
        colors.add("brown");
        colors.add("yellow");
        colors.add("orange");

        drinks.add("pumpkin");
        drinks.add("spiced latte");
        drinks.add("chai tea");
        drinks.add("hot cocoa");

        int colorIndex = rand.nextInt(colors.size());
        String randomColor = colors.get(colorIndex);
        int drinkIndex = rand.nextInt(drinks.size());
        String randomDrink = drinks.get(drinkIndex);
        do{
        System.out.println("Enter a temperature in Fahrenheit: ");
        int input = keyboard.nextInt();
            double celsius = tempFahToCel(input);

              if (input < 45) {
                  System.out.printf("Today's weather in Celsius is " + "%.2f", celsius);
                  System.out.println("\nThe weather is a bit chilly for fall ");
              } else if (input <= 70) {
                System.out.printf("Today's weather in Celsius is " + "%.2f",celsius);
                System.out.println("\nToday's weather is a perfect fall day for a cup of " + randomDrink + ".");
                System.out.println("The color of the leaves are " + randomColor);
            }
            else if (input > 70) {
                System.out.printf("Today's weather in Celsius is " + "%.2f",celsius );
                System.out.println("\nThe weather is a bit warm");
            }
            System.out.println("Would you like to enter another temperature Y(yes) or N(no) :");
            keyboard.nextLine();
            userResponse = keyboard.nextLine();

        } while (!userResponse.equalsIgnoreCase("n"));
            keyboard.close();
    }
    public static double tempFahToCel (int input){

        double celsius = (input - 32f)*5/9;

        return celsius ;
     }
    }

