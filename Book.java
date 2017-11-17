/**
 * A class that contains the information of a book
 * 
 *
 * @John Morrow
 * @November 16, 2017
 */
class Book
{
    // Book information
    private String author;
    private String title;
    private String subject;

    /**
     * Book constructor. Requires author, title, and subject input
     * Strings to construct
     */
    public Book(String bookAuthor, String bookTitle, String bookSubject)
    {
        author = bookAuthor;
        title = bookTitle;
        subject = bookSubject;
    }

    /**
     * Method to get author name
     */
    public String getBookAuthor()
    {
        return author;
    }
    
    /**
     * Method to get book title 
     */
    public String getBookTitle()
    {
        return title;
    }
    /**
     * Method to get book subject
     */
    public String getBookSubject()
    {
        return subject;
    }
}

