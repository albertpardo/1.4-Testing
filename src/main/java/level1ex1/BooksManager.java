package level1ex1;

import java.util.ArrayList;
import java.util.Collections;

public class BooksManager {
    private ArrayList<Book> bookCollection;
    
    public BooksManager(){
        this.bookCollection = new ArrayList<>();
    }

    public ArrayList<Book> getBookCollection(){
        return bookCollection;
    }

    public void addBook( Book newBook){
        if (bookCollection.contains(newBook)){
            System.err.println(" A book with title '" + newBook.getTitle() + "' exist!");
            return;
        }
        bookCollection.add(newBook);
        Collections.sort(bookCollection);
    }

    public Book getBookById(int id){
        if (id > -1 || id < bookCollection.size()) {
            return  bookCollection.get(id);
        }
        System.out.println(" Id = " + id + " out of range!");
        return null;
    }

    public void addBookById(int id, Book book){
        if (id > -1) {
            bookCollection.add(id, book);
            Collections.sort(bookCollection);
        }
        System.out.println(" Id must be great that 0");;
    }

    public void deleteBookByTitle(String title){
        /*
        for (int i = 0; i < bookCollection.size(); i++){
            if (getBookById(i).getTitle().equalsIgnoreCase(title)) {
                bookCollection.remove(i);
                Collections.sort(bookCollection);
                break;
            }
        }
        */
        int i = 0;
        boolean foundTitle = false;

        while (i < bookCollection.size() && !foundTitle){
            if (!getBookById(i).getTitle().equalsIgnoreCase(title))
                i++;
            else
                foundTitle = true;
        }
        if (foundTitle) {
            bookCollection.remove(i);
            Collections.sort(bookCollection);
        }
    }
}


