package com.github.rsoi.service;

import com.github.rsoi.domain.TelephoneData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TelephoneComparison {

    public static void main(String [] args){

        TelephoneData xiaomi = new TelephoneData("Сяоми Рэдми Ноут 11 Про версия",730,6.7, 8,true );
        TelephoneData samsung = new TelephoneData("Самсунг гэлакси A70",1300,6.2, 8,true );
        TelephoneData iPhone = new TelephoneData("Айфон 13 Про версия",2250,6.1, 4,false );
        TelephoneData huawei = new TelephoneData("Леново Vibe",670, 6.4, 6, false);
        TelephoneData honor = new TelephoneData("Хонор 70",1299, 6.7, 8, false);


        List<TelephoneData> telephonesArrayList = new ArrayList<>();

        telephonesArrayList.add(xiaomi);
        telephonesArrayList.add(samsung);
        telephonesArrayList.add(iPhone);
        telephonesArrayList.add(huawei);
        telephonesArrayList.add(honor);

        Scanner scanner = new Scanner(System.in);
        int menuNumber = 0;
        String stringToCheck;

        UserPhoneData userPhoneData = new UserPhoneData();

        System.out.println("Выбор телефона:");
        while (menuNumber!=3){
            System.out.println("Нажмите 1, чтобы просмотреть все телефоны\nНажмите 2, чтобы подобрать телефон \n3 - Выход");
            stringToCheck = scanner.next();
            try {
                menuNumber = Integer.parseInt(stringToCheck);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка!Только целочисленные!");
            }

            switch (menuNumber) {
                case 1:
                   for (TelephoneData phone: telephonesArrayList){
                       phone.getData();
                   }
                   break;
                case 2:
                    userPhoneData.searchForPhone();

                    int userMinPrice = userPhoneData.getUserMinimumPrice();
                    int userMaxPrice = userPhoneData.getUserMaximumPrice();
                    Double userSizeOfScreen= userPhoneData.getUserSizeOfScreen();
                    int userRAM = userPhoneData.getUserRAM();
                    Boolean userSDAvailable = userPhoneData.getUserSDAvailable();

                    for (TelephoneData telephoneData : telephonesArrayList) {
                        if (telephoneData.getPriceOfTheTelephone() > userMinPrice & telephoneData.getPriceOfTheTelephone() < userMaxPrice) {
                            increaseCounter(telephoneData);
                        }
                        if (telephoneData.getSizeOfTheScreen().equals(userSizeOfScreen)) {
                            increaseCounter(telephoneData);
                        }
                        if (telephoneData.getAmountOfRAM() == userRAM) {
                            increaseCounter(telephoneData);
                        }
                        if (telephoneData.getSdCardIsAvailable() == userSDAvailable) {
                            increaseCounter(telephoneData);
                        }
                    }

                    int maximum = telephonesArrayList.get(0).getMatchCounter();

                    for (TelephoneData telephoneData : telephonesArrayList) {
                        if (maximum < telephoneData.getMatchCounter())
                            maximum = telephoneData.getMatchCounter();
                    }

                    for (TelephoneData telephoneData : telephonesArrayList) {
                        if (telephoneData.getMatchCounter() == maximum) {
                            System.out.println("\nПодходяший вариант\n");
                            telephoneData.getData();
                        }
                    }
                case 3:
                    break;
            }
        }
    }
    private static void increaseCounter(TelephoneData telephoneData) {
        telephoneData.setMatchCounter(telephoneData.getMatchCounter() + 1);
    }
}
