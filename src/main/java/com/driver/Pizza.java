package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int extraCheese;
    private int extraTopping;
    private Boolean takeAway;
    private int tAway;




    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)
        {
            price=300;
        }
        else
            price=400;
    }

    public int getPrice(){

        return this.price;
    }



    public void addExtraCheese(){
        // your code goes here
        extraCheese+=80;
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg)
        {
            extraTopping+=70;
            price+=70;
        }
        else {
            extraTopping += 120;
            price+=120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeAway=true;
        tAway+=20;
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if(isVeg)
        {
            bill="\nBase Price Of The Pizza: "+300;
        }
        else
            bill="\nBase Price Of The Pizza: "+400;

        bill+="\nExtra Cheese Added: "+extraCheese;

        bill+="\nExtra Toppings Added: "+extraTopping;

        if(takeAway)
        {
            bill+="\nPaperbag Added: "+tAway;
        }

        bill+="\nTotal Price: "+price;

        return this.bill;
    }
}
