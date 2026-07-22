
import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagement {

    // Linear Search
    public void linearSearch(Book[] books, String key) {

        for (Book book : books) {

            if (book.title.equalsIgnoreCase(key)) {

                System.out.println("Book Found using Linear Search");
                System.out.println(book);
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    // Binary Search
    public void binarySearch(Book[] books, String key) {

        Arrays.sort(books, Comparator.comparing(book -> book.title));

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = books[mid].title.compareToIgnoreCase(key);

            if (result == 0) {

                System.out.println("Book Found using Binary Search");
                System.out.println(books[mid]);
                return;

            } else if (result < 0) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        System.out.println("Book Not Found.");
    }
}
