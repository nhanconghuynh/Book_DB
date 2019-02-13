package com.company;

import java.util.Scanner;

public class Book_LookUp {

        public static void main(String[] args) {

            Book_LookUp test = new Book_LookUp();

            Scanner keybd = new Scanner(System.in);

            System.out.print("Enter the Book Code: ");

            String code = keybd.nextLine();

            Book lookup = test.LookUp_SKU(code);
            System.out.println(lookup.getDisplayText());

        }


    private String code;

    private Book a = new Book();
    private Book b = new Book();
    private Book c = new Book();
    private Book d = new Book();
    private Book e = new Book();
    private Book f = new Book();

    private Book blank = new Book();

    public Book LookUp_SKU( String code){
        AddBooks(a, b, c, d, e, f);
        switch (code){
           case ("Java1001"):
               return a;
            case ("Java1002"):
                return b;
            case ("Orcl1003"):
                return c;
            case ("Python1004"):
                return d;
            case ("Zombie1005"):
                return e;
            case ("Rasp1006"):
                return f;
            default:
                return blank;
        }
    }

    public static void AddBooks(Book a, Book b, Book c, Book d, Book e, Book f){


        a.setCode("Java1001");

        a.setTitle("Head First Java");

        a.setAuthor("Kathy Sierra and Bert Bates");

        a.setPrice(47.50);

        a.setDescription("Programming advice book");

        a.setisInStock(true);

//        System.out.println(a.getDisplayText());

/*        System.out.print("\nEnter quantity of this book you would like to order: ");

        int quantity = keybd.nextInt();

        if (b.getisInStock())
        System.out.println("Total price for books ordered:" + b.calculate_Pricing(quantity));
        else System.out.println("Sorry this book currently out of stock.");

*/


        b.setCode("Java1002");

        b.setTitle("Thinking in Java");

        b.setAuthor("Bruce Eckel");

        b.setPrice(20.00);

        b.setDescription("Details about Java under the hood");

        b.setisInStock(true);



        c.setCode("Orcl1003");

        c.setTitle("OCP: Oracle Certified Professional Java SE");

        c.setAuthor("Jeanne Boyarsky");

        c.setPrice(45.00);

        c.setDescription("Everything you need to know in one place");

        c.setisInStock(true);


        d.setCode("Python1004");

        d.setTitle("Automate the Boring Stuff with Python");

        d.setAuthor("JAl Sweigart");

        d.setPrice(10.50);

        d.setDescription("Fun with Python");

        d.setisInStock(true);





        e.setCode("Zombie1005");

        e.setTitle("The Maker's Guide to the Zombie Apocalypse");

        e.setAuthor("Simon Monk");

        e.setPrice(16.50);

        e.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");

        e.setisInStock(true);



        f.setCode("Rasp1006");

        f.setTitle("Raspberry Pi Projects for the Evil Genius");

        f.setAuthor("Donald Norris");

        f.setPrice(14.75);

        f.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");

        f.setisInStock(true);


    }
}
