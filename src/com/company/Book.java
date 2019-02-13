package com.company;

import java.math.RoundingMode;
import java.text.NumberFormat;

public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private String code;
    private boolean isInStock;

    private int pages;
    protected static int count = 0; // a protected static variable

    //default constructor
    Book() {
        code = "";
        description = "";
        price = 0.0;
    }

     //overloaded constructor
    Book(String str) {
        code = str;
    }

    // Get and set accessors for the code, description, and price instance variables

    public String getDisplayText() {
        return  "Author:             " + author + "\n" +
                "Title:              " + title  + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice(price) + "\n" +
                "In Stock:           " + this.getFormattedStock(isInStock);
    }

    public String getTitle() {

        return title;

    }



    public void setTitle(String title) {

        this.title = title;

    }



    public String getAuthor() {

        return author;

    }


    public void setAuthor(String author) {

        this.author = author;

    }

    public String getDescription() {

        return description;

    }



    public void setDescription(String description) {

        this.description = description;

    }


    private String getFormattedPrice(double price) {

        // Use the NumberFormat class to format the price to 2 decimal places

        NumberFormat nf = NumberFormat.getInstance();

        nf.setMaximumFractionDigits(2);

        nf.setMinimumFractionDigits(2);

        nf.setRoundingMode(RoundingMode.HALF_UP);

        return nf.format(price);

    }

    private void setFormattedPrice() {

        price = Math.round(price*100.0)/100.0;

    }


    public String returnFormattedPrice()

    {

        return getFormattedPrice(price);

    }



    public double getPrice() {

        setFormattedPrice();
        return price;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public String getCode() {

        return code;

    }


    public void setCode(String code) {

        this.code = code;

    }


    // Create public access for the count variable
    public static int getCount() {
        return count;
    }


    public int getPages() {

        return pages;

    }


    public void setPages(int pages) {

        this.pages = pages;

    }


    public String getFormattedStock(boolean isInStock) {
        if (isInStock) return "yes";
        else return "no";
    }



    public boolean getisInStock() {

        return isInStock;

    }


    public void setisInStock(boolean isInStock) {

        this.isInStock = isInStock;

    }


    public double calculate_Pricing (int num) {
        if (isInStock) return (num * getPrice());
        else return (-1);
    }

}
