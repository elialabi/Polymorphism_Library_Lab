

public class Book extends Media{



    private String author;
    private String cover;


    public Book(String title, double cost, String author, String cover) {
        super(title, cost);
        this.author = author;
        this.cover = cover;
    }

    public String getAuthor(){
        return author;
    }

    public String getCover(){
        return this.cover;
    }


    public boolean isHardcover() {
        return this.cover.equalsIgnoreCase("hardcover");

    }

    public boolean isSoftCover(){
        return this.cover.equalsIgnoreCase("softcover");
    }

    public void setCostToZero(){
        this.cost = 0.0;
    }
}



