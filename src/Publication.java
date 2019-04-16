public class Publication {
    private String title;
    private String author;
    private int numberPage;
    private double price;
    // costruttore
    public Publication(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.numberPage = (int) (this.price/0.10);
        this.price = price;
    }
    //get e set title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    //get e set author
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    //get e set numberpage
    public int getNumberPage() {
        return numberPage;
    }
    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
        double price = (double)(numberPage*0.10);
        this.setPrice(price);
    }
    //get e set price
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
        int numberPage = (int) (price/0.10);
        this.numberPage = numberPage;
    }
    //metodo toString
    public String toString () {
        return "title: " + title + " author" + author + " n.Pages: " + numberPage + " Price: " + price;
    }
}
