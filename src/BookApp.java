import java.util.Scanner;

public class BookApp {

    public static void main(String[] args) {

        Book book = new Book();
        book.setTitle("Crazy Rich Asians");
        book.setAuthor("Kevin Kwan");
        book.setDescription("They are Asians and they are crazy rich.");

        Scanner keyboard = new Scanner(System.in);

        Book b = new Book("A Walk to Remember", "Nicholas Sparks", "Popular boy falls in love with outcast girl, they start dating, then he finds out she has cancer. He spends the rest of her short life helping her check off items on her bucket list.");
        System.out.println(b.getDisplayText());
        System.out.println(book.getDisplayText());

        Book book1 = new Book();
        book1.setPrice(20);


        //user input
        System.out.println("How many books would you like to purchase?");
        String bookNum = keyboard.next();
        int bookNumber = Integer.parseInt(bookNum);




        if (bookNumber > 10){
            int bookNumber1 = bookNumber - 10;
            System.out.println("There are only " + bookNumber1 + " left in stock");
        }
        else{

            System.out.println("Your total is $" + bookNumber * 20);
        }


    }

    public static void Books(String[] args)
    {


    }



}


