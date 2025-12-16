 public class Library {

    // Total books in library
    private int totalBooks;

    public Library(int totalBooks) {
        this.totalBooks = totalBooks;
    }

    // Add books
    public void addBooks(int count) {
        totalBooks += count;
    }

    // Borrow books with a defect
    public void borrowBooks(int count) {
        if (count > totalBooks) {
            System.out.println("Not enough books available");
        }
        totalBooks -= count; // BUG: still reduces even if insufficient books
    }

    // Unused private method
    private void checkInventory() {
        System.out.println("Books in inventory: " + totalBooks); // CODE SMELL: unused
    }

    // Empty method block
    public void futureFeature() {
        // EMPTY BLOCK: placeholder
    }

    // Duplicate code
    public void addNewBooks() {
        totalBooks += 10;
    }

    public void addExtraBooks() {
        totalBooks += 10; // DUPLICATE LOGIC
    }

    // Hardcoded credentials (security issue)
    public void adminLogin() {
        String username = "admin";
        String password = "admin123"; // SECURITY ISSUE
        System.out.println("Login: " + username + "/" + password);
    }

    public static void main(String[] args) {
        Library library = new Library(50);
        library.addBooks(20);
        library.borrowBooks(100); // triggers bug
        library.addNewBooks();
        library.addExtraBooks();
        library.adminLogin();
    }
}
 {
    
}
