class Library{
    String[] books;
    int noOfBooks;
    
    Library(){
        this.books = new String[100];
        noOfBooks = 0;
    }

    void addBook(String book){
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added");
    }

    void showAvailableBooks(){
        for(String book: this.books){
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
    }

    void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i]==(book)){
                System.out.println("The book has been issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("The book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class OnlineLibraryExercise {
    public static void main(String[] args) {
        
        Library centralLibrary = new Library();

        centralLibrary.addBook("Java");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("DSA");
        centralLibrary.addBook("OOPS");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Java");
        centralLibrary.issueBook("DSA");

        centralLibrary.showAvailableBooks();

        centralLibrary.returnBook("DSA");
        
        centralLibrary.showAvailableBooks();
    }
}
