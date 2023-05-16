package kadai1.main;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import kadai1.logics.Book;
import kadai1.logics.TitleComparator;


public class Main {
    public static void main(String[] args){
        List<Book> books = new ArrayList<>();
        SimpleDateFormat f = new SimpleDateFormat("yyyy/mm/dd");
        try{
        Book b1 = new Book();
            b1.setTitle("Java入門");
            b1.setPublishDate(f.parse("2011/10/07"));
            b1.setComment("スッキリわかる");
            books.add(b1);
            Book b2 = new Book();
            b2.setTitle("Python入門");
            b2.setPublishDate(f.parse("2019/06/11"));
            b2.setComment("カレーが食べたくなる");
            books.add(b1);
            Book b3 = new Book();
            b3.setTitle("C言語入門");
            b3.setPublishDate(f.parse("2018/06/21"));
            b3.setComment("ポインタも自由自在");
            books.add(b3);
        }catch(ParseException e){
            e.printStackTrace();
        }
        Collections.sort(books, new TitleComparator());

        for(Book b: books){
            System.out.println(b.getTitle()+" "+f.format(b.getPublishDate())+" "+b.getComment());
        }
    }
}
