import java.util.Scanner;

public class Main {
    // Creating class
    public static class Book {
        // private properties
        private String title;
        private String author;
        private int numberOfPages;

        // getters and setters go here
        // Remember: 
        // 1. They must not allow empty string for 'title' and 'author'.
        // 2. They must not allow negative or zero value for 'numberOfPages'.
        // 3. If such values are attempted to be set, the property should remain unchanged.
        public void setTitle(String title) {
            if (title != null && !title.trim().isEmpty()) { // Check for non-empty title
                this.title = title;
            }
        }

        // Accessor for title
        public String getTitle() {
            return title;
        }

        // Mutator for author
        public void setAuthor(String author) {
            if (author != null && !author.trim().isEmpty()) { // Check for non-empty author
                this.author = author;
            }
        }

        // Accessor for author
        public String getAuthor() {
            return author;
        }

        // Mutator for numberOfPages
        public void setNumberOfPages(int numberOfPages) {
            if (numberOfPages > 0) { // Check for positive number of pages
                this.numberOfPages = numberOfPages;
            }
        }

        // Accessor for numberOfPages
        public int getNumberOfPages() {
            return numberOfPages;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an object of the Book class
        Book book = new Book();

        // Take Title, Author and numberOfPages as next inputs and set them using the mutator methods
        String titleInput = scanner.nextLine(); // Read title input
        String authorInput = scanner.nextLine(); // Read author input
        int pagesInput = scanner.nextInt();

        book.setTitle(titleInput);
        book.setAuthor(authorInput);
        book.setNumberOfPages(pagesInput);

        // Then use the accessor methods to get and print these values.
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());

        scanner.close();
    }
}