package kadai1.logics;

import java.util.*;

public class Book  implements Comparable<Book>, Cloneable{
    private String title;
    private Date publishDate;
    private String comment;

    public String getTitle(){
        return this.title;
    }
    public Date getPublishDate(){
        return this.publishDate;
    }
    public String getComment(){
        return this.comment;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setPublishDate(Date publishDate){
        this.publishDate = publishDate;
    }
    public void setComment(String comment){
        this.comment = comment;
    }

    public boolean equals(Object o){
        if(o==this) return true;
        if(o==null) return false;
        if(!(o instanceof Book)) return false;
        Book book = (Book)o;
        if(!publishDate.equals(book.publishDate)) return false;
        if(!title.equals(book.title)) return false;
        return true;
    }

    public int hashCode(){
        return Objects.hash(this.publishDate, this.title, this.comment);
    }

    public int compareTo(Book book){
        return this.publishDate.compareTo(book.publishDate);
    }

    public Book clone(){
        Book result = new Book();
        result.title = this.title;
        result.comment = this.comment;
        this.publishDate = (Date)this.publishDate.clone();
        
        return result;
    }
}
