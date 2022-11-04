package com.company;

public class Main {

    public static void main(String[] args) {
        Book [] array = new Book[2];
        String [] authors = new String[1];
        authors [0] = "Charles Dickens";
        String [] authors2 = new String[1];
        authors2 [0] = "Marjane Satrapi";
        array[0] = new Book("Hard Times", authors, 1854);
        array[1] = new Book ("Persepolis", authors2, 2004);

        for (Book book: array)
            System.out.println(book);
    }
}

class Book
{
    public Book (String title, String[] authors, int publicationYear)
    {
        this.title = title;
        this.authors = authors;
        this.publicationYear = publicationYear;
    }

    public String toString ()
    {
        StringBuilder strBuffer = new StringBuilder();
        int numAuth = authors.length;
        for (int i = 0; i < numAuth; i = i + 1)
        {
            strBuffer.append (authors [i]);
            if (i != numAuth - 1)
                strBuffer.append (" & ");
        }
        strBuffer.append(": ").append(title).append(" ");
        strBuffer.append("(").append(publicationYear).append(")");

        return strBuffer.toString ();
    }

    public String getTitle ()
    {
        return title;
    }

    public String[] getAuthors ()
    {
        return authors;
    }

    public int getPublicationYear ()
    {
        return publicationYear;
    }

    public int numAuthors ()
    {
        return authors.length;
    }

    public boolean newerThan (Book book)
    {
        return publicationYear > book.getPublicationYear ();
    }

    private final String title;
    private final String[] authors;
    private final int publicationYear;
}
