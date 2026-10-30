class Book{
    private int bookid;
    private String title;
    private String author;
    private boolean available;

    Book(int bookid,String title,String author){
        this.bookid=bookid;
        this.title=title;
        this.author=author;
        this.available=true;
    }
    void displaybook()
    {
        System.out.println("Book_ID  : "+bookid);
        System.out.println("Title    : "+title);
        System.out.println("Author   : "+author);
        System.out.println("Available: "+available);


    }
    public int getBookid()
    {
        return bookid;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return available;
    }
}

public class Library {
    public static void main(String[]args)
    {
        Book book1=new Book(1001,"Programming java","James mcnaacal");
        Book book2=new Book(1002,"Programming python","Arun Pandian");
        System.out.println("=========Library========");
        book1.displaybook();
        book2.displaybook();
    }
}
