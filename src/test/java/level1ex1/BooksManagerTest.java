package level1ex1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BooksManagerTest {

    @Test
    @DisplayName("Check if exist a Book list after create a BooksManager object")
    void getBookCollection() {
        BooksManager booksManager = new BooksManager();
        assertNotNull(booksManager.getBookCollection());
    }

    @Test
    @DisplayName("Check if books list has correct number of books after insert books")
    void addBook(){
        BooksManager booksManager = new BooksManager();
        assertTrue(booksManager.getBookCollection().isEmpty());
        booksManager.addBook(new Book("Title 1"));
        assertEquals(1, booksManager.getBookCollection().size());
        booksManager.addBook(new Book("Title 2"));
        booksManager.addBook(new Book("Title 3"));
        booksManager.addBook(new Book("Title 4"));
        assertEquals(4, booksManager.getBookCollection().size());
    }

    @Test
    @DisplayName("check one book is in the correct position")
    void check_one_book_is_in_the_correct_position(){

        Book book3 = new Book("Title 3");
        BooksManager booksManager = new BooksManager();
        booksManager.addBook(new Book("Title 1"));
        booksManager.addBook(new Book("Title 2"));
        booksManager.addBook(book3);
        booksManager.addBook(new Book("Title 4"));

        assertEquals(book3, booksManager.getBookById(2), " book3 is not on correct position");
    }

    @Test
    @DisplayName("Check for no duplicated Books")
    void check_no_duplicated_books(){

        ArrayList<Book> testBooksList = new ArrayList<>();
        testBooksList.add(new Book("Title 1"));
        testBooksList.add(new Book("Title 2"));
        testBooksList.add(new Book("Title 3"));
        testBooksList.add(new Book("Title 4"));

        BooksManager booksManager = new BooksManager();
        booksManager.addBook(new Book("Title 1"));
        booksManager.addBook(new Book("Title 2"));
        booksManager.addBook(new Book("Title 3"));
        booksManager.addBook(new Book("Title 4"));

        assertEquals(testBooksList, booksManager.getBookCollection());

        booksManager.addBook(new Book("Title 4"));
        assertEquals(testBooksList, booksManager.getBookCollection(), "Has not detect a book with the same name in the book list!");
    }

    @Test
    @DisplayName("check get book title from one position")
    void check_book_title_in_a_position(){

        String title = "Title 3";
        BooksManager booksManager = new BooksManager();
        booksManager.addBook(new Book("Title 1"));
        booksManager.addBook(new Book("Title 2"));
        booksManager.addBook(new Book(title));
        booksManager.addBook(new Book("Title 4"));
        assertEquals(title, booksManager.getBookById(2).getTitle(), "The book with title '" + title + "` is not on correct position");
    }

    @Test
    @DisplayName("check add one book increase bookList size")
    void check_add_one_book_modify_bookList(){
        int previousNumBooks;
        int newNumBooks;
        BooksManager booksManager = new BooksManager();

        booksManager.addBook(new Book("Title 1"));
        previousNumBooks = booksManager.getBookCollection().size();
        booksManager.addBook(new Book("Title 2"));
        newNumBooks = booksManager.getBookCollection().size();
        assertTrue(previousNumBooks < newNumBooks, " Adding one book hasn´t modify book list");
    }

    @Test
    @DisplayName("check add one book decrease bookList size")
    void check_add_one_book_decrease_bookList_size(){
        int previousNumBooks;
        int newNumBooks;
        BooksManager booksManager = new BooksManager();
        String title2 = "Title 2";

        booksManager.addBook(new Book("Title 1"));
        booksManager.addBook(new Book(title2));
        booksManager.addBook(new Book("Title 3"));
        previousNumBooks = booksManager.getBookCollection().size();
        booksManager.deleteBookByTitle(title2);
        newNumBooks = booksManager.getBookCollection().size();
        assertTrue(previousNumBooks > newNumBooks, " Deleting one book hasn´t modify book list");



    }


}