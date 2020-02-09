package com.example.secondapplication;

import java.util.ArrayList;
import java.util.List;

public class FoodLists {
    List<String> Foodlist (String dayforfood){

        List<String> food = new ArrayList<>();

        if (dayforfood.equals("Monday")){
            food.add("Bread and Warm Tea");
            food.add("Rice and Stew");
            food.add("Yam and egg");
        }
        else if (dayforfood.equals("Tuesday")){
            food.add("Pap and Akara");
            food.add("Spagetti and Fried Chicken");
            food.add("African Amala and Gbegiri with Ewedu");
        }
        else if (dayforfood.equals("Wednesday")){
            food.add("Rice and Beans");
            food.add("Small Chops and Juice");
            food.add("Porridge with sauce");
        }
        else if (dayforfood.equals("Thursday")){
            food.add("Jollof Rice and Fried Rice with Less Fatty Meat and Chilled Drink");
            food.add("Fruits");
            food.add("Custard and Bean Cake or MoiMoi");
        }
        else if (dayforfood.equals("Friday")){
            food.add("Noodles and Egg");
            food.add("Rice and Vegetables");
            food.add("Beans and Fried Plantain");
        }
        else if (dayforfood.equals("Saturday")){
            food.add("Warm coffee, Fruit Salad");
            food.add("Pizza or Fries");
            food.add("Pounded Yam and Vegetables with Assorted Meats");
        }
        else if (dayforfood.equals("Sunday")){
            food.add("Sabbath Day, No Breakfast");
            food.add("White Rice and Stew");
            food.add("Eba and Okro Soup or Garri and Fish");
        }
        return food;
    }
}
