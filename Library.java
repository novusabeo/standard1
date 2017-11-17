import java.util.*;

/**
 * Library Class to interact with Book Class for storage of Books
 *
 * @John Morrow
 * @November 16, 2017
 */
public class Library
{
    
    private String libraryname;
    private int bookcapacity;
    private ArrayList<Book> books;

    /**
     * Constructor for Library
     */
    public Library(int maxbooks, String name)
    {
        bookcapacity = maxbooks;
        libraryname = name;
        books = new ArrayList<Book>();
    }

    /**
     * Method for adding Book class objects to library 
     */
    public void addBook(Book name)
    {
        if(books.size() == bookcapacity){
            System.out.println("This library has reached it capacity for books.");
        }
        else {
            books.add(name);
        }
    }
    
    /**
     * Method for inspecting books contained in the library
     */
    
    public int librarySize()
    {
        return books.size();
    }
          
    }
    

