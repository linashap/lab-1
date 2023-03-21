package com.github.rsoi.domain;
public class TelephoneData {

    //vars
    private String nameOfTheTelephone;
    private int priceOfTheTelephone;
    private Double sizeOfTheScreen;
    private int amountOfRAM;
    private Boolean sdCardIsAvailable;

    private int matchCounter = 0;

    public TelephoneData(String nameOfTheTelephone, int priceOfTheTelephone, Double sizeOfTheScreen, int amountOfRAM, Boolean sdCardIsAvailable){
        this.nameOfTheTelephone = nameOfTheTelephone;
        this.priceOfTheTelephone = priceOfTheTelephone;
        this.sizeOfTheScreen = sizeOfTheScreen;
        this.amountOfRAM = amountOfRAM;
        this.sdCardIsAvailable = sdCardIsAvailable;
    }

    public void getData(){
        System.out.println("Наименование " + nameOfTheTelephone);
        System.out.println("Цена " + priceOfTheTelephone);
        System.out.println("Размер дисплея " + sizeOfTheScreen);
        System.out.println("Количество оперативной памяти " + amountOfRAM);

        if (sdCardIsAvailable){
            System.out.println("Есть SD слот ");
        }
        else {
            System.out.println("SD слот отсутствует");
        }
        System.out.println("-----------------------------");
    }










    public String getNameOfTheTelephone() {
        return nameOfTheTelephone;
    }

    public void setNameOfTheTelephone(String nameOfTheTelephone) {
        this.nameOfTheTelephone = nameOfTheTelephone;
    }

    public int getPriceOfTheTelephone() {
        return priceOfTheTelephone;
    }

    public void setPriceOfTheTelephone(int priceOfTheTelephone) {
        this.priceOfTheTelephone = priceOfTheTelephone;
    }

    public Double getSizeOfTheScreen() {
        return sizeOfTheScreen;
    }

    public void setSizeOfTheScreen(Double sizeOfTheScreen) {
        this.sizeOfTheScreen = sizeOfTheScreen;
    }

    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    public Boolean getSdCardIsAvailable() {
        return sdCardIsAvailable;
    }

    public void setSdCardIsAvailable(Boolean sdCardIsAvailable) {
        this.sdCardIsAvailable = sdCardIsAvailable;
    }
    public int getMatchCounter() {
        return matchCounter;
    }

    public void setMatchCounter(int matchCounter) {
        this.matchCounter = matchCounter;
    }
}
