package com.company;



public class Book_LookUp {

    private String code;
    private Book a = new Book();
    private Book b = new Book();
    private Book c = new Book();
    private Book d = new Book();
    private Book e = new Book();
    private Book f = new Book();


    public Book_LookUp(String str){

        code = str;
        LookUp_SKU(code);
    }

    public void LookUp_SKU(String str) {
        AddBooks();
        if (str.equalsIgnoreCase("Java1001"))
        {
            System.out.println(a.getDisplayText());
        }
    }

    public static void AddBooks(){

//        Book a = new Book();

        this.a.setCode("Java1001");

        this.a.setTitle("Head First Java");

        this.a.setAuthor("Kathy Sierra and Bert Bates");

        this.a.setPrice(47.50);

        this.a.setDescription("Programming advice book");

        this.a.setisInStock(true);

//        System.out.println(a.getDisplayText());

/*        System.out.print("\nEnter quantity of this book you would like to order: ");

        int quantity = keybd.nextInt();

        if (b.getisInStock())
        System.out.println("Total price for books ordered:" + b.calculate_Pricing(quantity));
        else System.out.println("Sorry this book currently out of stock.");

*/

 /*       Book b = new Book();

        b.setCode("Java1002");

        b.setTitle("Thinking in Java");

        b.setAuthor("Bruce Eckel");

        b.setPrice(20.00);

        b.setDescription("Details about Java under the hood");

        b.setisInStock(true);

        System.out.println(b.getDisplayText());


        Book c = new Book();

        c.setCode("Orcl1003");

        c.setTitle("OCP: Oracle Certified Professional Java SE");

        c.setAuthor("Jeanne Boyarsky");

        c.setPrice(45.00);

        c.setDescription("Everything you need to know in one place");

        c.setisInStock(true);

        System.out.println(c.getDisplayText());


        Book d = new Book();

        d.setCode("Python1004");

        d.setTitle("Automate the Boring Stuff with Python");

        d.setAuthor("JAl Sweigart");

        d.setPrice(10.50);

        d.setDescription("Fun with Python");

        d.setisInStock(true);

        System.out.println(d.getDisplayText());


        Book e = new Book();

        e.setCode("Zombie1005");

        e.setTitle("The Maker's Guide to the Zombie Apocalypse");

        e.setAuthor("Simon Monk");

        e.setPrice(16.50);

        e.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");

        e.setisInStock(true);

        System.out.println(e.getDisplayText());


        Book f = new Book();

        f.setCode("Rasp1006");

        f.setTitle("Raspberry Pi Projects for the Evil Genius");

        f.setAuthor("Donald Norris");

        f.setPrice(14.75);

        f.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");

        f.setisInStock(true);

        System.out.println(f.getDisplayText());
*/
    }
}
