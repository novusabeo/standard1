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
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, String bookSubject)
    {
        author = bookAuthor;
        title = bookTitle;
        subject = bookSubject;
    }

    public String getBookAuthor()
    {
        return author;
    }
    
    public String getBookTitle()
    {
        return title;
    }
    public String getBookSubject()
    {
        return subject;
    }
}

