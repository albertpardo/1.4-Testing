package level1ex1;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;

    public Book(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return (title.equalsIgnoreCase(book.title));
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(title.toLowerCase());
    }

    @Override
    public int compareTo(Book book) {
        return title.compareToIgnoreCase(book.title);
    }
}
