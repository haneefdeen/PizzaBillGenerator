import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------Welcome to Dominos Pizza---------"); 
        System.out.println("How many pizzas do you want to order?");
        int numPizzas = sc.nextInt();
        sc.nextLine(); 
        
        int totalBill = 0;
        
        for (int i = 1; i <= numPizzas; i++) {
            System.out.println("Pizza " + i + ": What type of pizza do you want? (veg/non-veg)");
            String type = sc.nextLine().toLowerCase();
            boolean isVeg = type.equals("veg");
            
            Pizza pizza = new Pizza(isVeg);
            
            System.out.println("Do you want to add extra cheese? (yes/no)");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                pizza.addExtraCheese();
            }
            
            System.out.println("Do you want to add extra toppings? (yes/no)");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                pizza.addExtraToppings();
            }
            
            System.out.println("Do you want a stuffed crust? (yes/no)");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                pizza.addStuffedCrust();
            }
            
            System.out.println("Do you want takeaway? (yes/no)");
            if (sc.nextLine().equalsIgnoreCase("yes")) {
                pizza.takeAway();
            }
            
            System.out.println("Select pizza size: Small (Rs.50), Medium (Default), Large (Rs.100) (small/medium/large)");
            String size = sc.nextLine().toLowerCase();
            pizza.selectSize(size);
            
            pizza.getBill();
            totalBill += pizza.getTotalPrice();
        }
        
        System.out.println("Do you want to add a drink to your order? (yes/no)");
        if (sc.nextLine().equalsIgnoreCase("yes")) {
            System.out.println("Select a drink: Coke (Rs.60), Pepsi (Rs.60), Mojito (Rs.80)");
            String drink = sc.nextLine().toLowerCase();
            int drinkPrice = 0;
            if (drink.equals("coke") || drink.equals("pepsi")) {
                drinkPrice = 60;
            } else if (drink.equals("mojito")) {
                drinkPrice = 80;
            } else {
                System.out.println("Invalid drink selection, no drink added.");
            }
            totalBill += drinkPrice;
            
                System.out.println("Drink added: " + drink + " Rs." + drinkPrice);
                totalBill -= 50; 
                System.out.println("Combo Offer Applied: Rs.50 off on Pizza + Drink");
            
        }
        
        if (totalBill > 1000) {
            int discount = (int) (totalBill * 0.10);
            totalBill -= discount;
            System.out.println("Discount Applied: Rs." + discount);
        }
        
        System.out.println("Final Total Bill: Rs." + totalBill);
        System.out.println("------Thankyou,Visit us again!!!------");
        
    }
}