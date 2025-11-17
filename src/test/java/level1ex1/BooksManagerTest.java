package level1ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BooksManagerTest {
    private static final String TITLE1 = "Title 1";
    private static final String TITLE2 = "Title 2";
    private static final String TITLE3 = "Title 3";
    private static final String TITLE4 = "Title 4";

    private BooksManager booksManager;
    ArrayList<Book> testBooksList;
    
    @BeforeEach
    void createObjects(){
        booksManager = new BooksManager();
        testBooksList = new ArrayList<>();
    }
    
    @Test
    @DisplayName("Check if exist a Book list after create a BooksManager object")
    void getBookCollection() {
        assertNotNull(booksManager.getBookCollection());
    }

    @Test
    @DisplayName("Check if books list has correct number of books after insert books")
    void addBook(){
        
        assertTrue(booksManager.getBookCollection().isEmpty());
        booksManager.addBook(new Book(TITLE1));
        assertEquals(1, booksManager.getBookCollection().size());
        booksManager.addBook(new Book(TITLE2));
        booksManager.addBook(new Book(TITLE3));
        booksManager.addBook(new Book(TITLE4));
        assertEquals(4, booksManager.getBookCollection().size());
    }

    @Test
    @DisplayName("check one book is in the correct position")
    void check_one_book_is_in_the_correct_position(){

        Book book3 = new Book(TITLE3);
        booksManager.addBook(new Book(TITLE1));
        booksManager.addBook(new Book(TITLE2));
        booksManager.addBook(book3);
        booksManager.addBook(new Book(TITLE4));

        assertEquals(book3, booksManager.getBookById(2), " book3 is not on correct position");
    }

    @Test
    @DisplayName("Check for no duplicated Books")
    void check_no_duplicated_books(){

        testBooksList.add(new Book(TITLE1));
        testBooksList.add(new Book(TITLE2));
        testBooksList.add(new Book(TITLE3));
        testBooksList.add(new Book(TITLE4));

        
        booksManager.addBook(new Book(TITLE1));
        booksManager.addBook(new Book(TITLE2));
        booksManager.addBook(new Book(TITLE3));
        booksManager.addBook(new Book(TITLE4));

        assertEquals(testBooksList, booksManager.getBookCollection());

        booksManager.addBook(new Book(TITLE4));
        assertEquals(testBooksList, booksManager.getBookCollection(), "Has not detect a book with the same name in the book list!");
    }

    @Test
    @DisplayName("check get book title from one position")
    void check_book_title_in_a_position(){

        booksManager.addBook(new Book(TITLE1));
        booksManager.addBook(new Book(TITLE2));
        booksManager.addBook(new Book(TITLE3));
        booksManager.addBook(new Book(TITLE4));
        assertEquals(TITLE3, booksManager.getBookById(2).getTitle(), "The book with title '" + TITLE3 + "` is not on correct position");
    }

    @Test
    @DisplayName("check add one book increase bookList size")
    void check_add_one_book_modify_bookList(){
        int previousNumBooks;
        int newNumBooks;
        
        booksManager.addBook(new Book(TITLE1));
        previousNumBooks = booksManager.getBookCollection().size();
        booksManager.addBook(new Book(TITLE2));
        newNumBooks = booksManager.getBookCollection().size();
        assertTrue(previousNumBooks < newNumBooks, " Adding one book has not modify book list");
    }

    @Test
    @DisplayName("check add one book decrease bookList size")
    void check_add_one_book_decrease_bookList_size(){
        int previousNumBooks;
        int newNumBooks;
        
        booksManager.addBook(new Book(TITLE1));
        booksManager.addBook(new Book(TITLE2));
        booksManager.addBook(new Book(TITLE3));
        previousNumBooks = booksManager.getBookCollection().size();
        booksManager.deleteBookByTitle(TITLE2);
        newNumBooks = booksManager.getBookCollection().size();
        assertTrue(previousNumBooks > newNumBooks, " Deleting one book has not modify book list");
    }

    @Test
    @DisplayName("check book list is sorted after add one book by ID or delete one book by tittle")
    void check_book_list_is_sorted_after_add_or_delete_one_book(){
        final String TITLE30 = "Title 30";
        final String TITLE35 = "Title 35";
        final String TITLE40 = "Title 40";
        
        testBooksList.add(new Book(TITLE1));
        testBooksList.add(new Book(TITLE30));
        testBooksList.add(new Book(TITLE40));

        booksManager.addBook(new Book(TITLE30));
        booksManager.addBook(new Book(TITLE40));
        booksManager.addBook(new Book(TITLE1));
        assertEquals(testBooksList, booksManager.getBookCollection(), "Previous test to check add or delete a book fails: adding a three books in a empty list are not sort ");

        ArrayList<Book> testBooksList2 = new ArrayList<>();
        testBooksList2.add(new Book(TITLE1));
        testBooksList2.add(new Book(TITLE30));
        testBooksList2.add(new Book(TITLE35));
        testBooksList2.add(new Book(TITLE40));

        booksManager.addBookById(0, new Book(TITLE35));
        assertEquals(testBooksList2, booksManager.getBookCollection(), "the book list is not sorted after add a book by id! ");

        booksManager.deleteBookByTitle(TITLE35);
        assertEquals(testBooksList, booksManager.getBookCollection(), "the book list is not sorted after delete a book by title! ");

    }


}