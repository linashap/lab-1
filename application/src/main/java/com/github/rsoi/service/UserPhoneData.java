package com.github.rsoi.service;

import java.util.Scanner;

public class UserPhoneData {

    int userMinimumPrice = -1;
    int userMaximumPrice = -1;
    int userRAM = 0;
    Double userSizeOfScreen = 0.0;
    Boolean userSDAvailable = null;
    public void searchForPhone(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Минимальная цена");
        do {
            try {
                userMinimumPrice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e){
                System.out.println("Ошибка!Только целочисленные!");
            }
        } while (userMinimumPrice < 0);

        System.out.println("Максимальная цена");
        do {
            try {
                userMaximumPrice = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e){
                System.out.println("Ошибка!Только целочисленные!");
            }
        } while (userMaximumPrice == 0);

        System.out.println("Размер дисплея");
        do {
            try {
                userSizeOfScreen = Double.parseDouble(scanner.next());
            } catch (NumberFormatException e){
                System.out.println("Ошибка!Только с плавающей точки!");
            }
        } while (userSizeOfScreen == 0);


        System.out.println("Количесво оперативной памяти");
        do {
            try {
                userRAM = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e){
                System.out.println("Ошибка!Только целочисленные!");
            }
        } while (userRAM == 0);

        System.out.println("Наличие CD слота");
        do {
            try {
                String booleanHelper;
                booleanHelper = scanner.next();
                if (booleanHelper.equals("Есть") || booleanHelper.equals("есть")){
                    userSDAvailable = true;
                } else if (booleanHelper.equals("Нет") || booleanHelper.equals("нет")){
                    userSDAvailable = false;
                }
            } catch (NumberFormatException e){
                System.out.println("Ошибка!Напишите Есть или Нет");
            }
        } while (userSDAvailable == null);
    }

    public int getUserMinimumPrice() {
        return userMinimumPrice;
    }

    public int getUserMaximumPrice() {
        return userMaximumPrice;
    }

    public int getUserRAM() {
        return userRAM;
    }

    public Double getUserSizeOfScreen() {
        return userSizeOfScreen;
    }

    public Boolean getUserSDAvailable() {
        return userSDAvailable;
    }
}
