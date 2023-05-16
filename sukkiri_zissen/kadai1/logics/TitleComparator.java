package kadai1.logics;
import kadai1.logics.Book;
import java.util.Comparator;

public class TitleComparator implements Comparator<Book>{
    public int compare(Book x, Book y){
        return x.getTitle().compareTo(y.getTitle());
    }
}