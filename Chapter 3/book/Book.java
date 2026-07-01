public class Book {
    private Author author;
    private String title;
    private int noOfPages;
    private boolean fiction;

    
    public Author getAuthor(){
        return this.author;
    }

    public void setAuthor(Author newAuthor){
        this.author = newAuthor; 
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getNoOfPages(){
        return this.noOfPages;
    }

    public void setNoOfPages(int newOfNoPages){
        this.noOfPages = newOfNoPages;
    }

    public boolean isFiction(){
        return this.fiction;
    }

    public void setIsFiction(boolean bool){
        this.fiction = bool;
    }
}
