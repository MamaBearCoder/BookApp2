import java.util.Random;

public class Book {
    private String author;
    private String title;
    private String description;
    private int price;
    private boolean IsInStock;


    public Book() {

    }

    public String getDisplayText() {
        return title + " " + "is written by" + " " + author + "\n" + description;
    }


    public Book(String title, String author, String description) {
        this.title = title;
        this.author = author;
        this.description = description;

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

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int setPrice(int price)
    {
        return price;
    }

    public void getPrice() {

        this.price = price;
    }

    public boolean setIsInStock(boolean IsInStock)
    {
        Random r = new Random();
        IsInStock = r.nextBoolean();
        return IsInStock;
    }

    public void getIsInStock()
    {
        this.IsInStock = IsInStock;
    }


}











