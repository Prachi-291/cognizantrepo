
public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido van Rossum"),
                new Book(103, "C Programming", "Dennis Ritchie"),
                new Book(104, "Data Structures", "Mark Allen"),
                new Book(105, "Operating System", "Galvin")

        };

        LibraryManagement library = new LibraryManagement();

        System.out.println("===== Linear Search =====");
        library.linearSearch(books, "Python");

        System.out.println("\n===== Binary Search =====");
        library.binarySearch(books, "Python");
    }
}
