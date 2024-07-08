public class Main {
    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM users");

        // Get another instance
        DatabaseConnection db2 = DatabaseConnection.getInstance();

        // Execute another query
        db2.query("SELECT * FROM products");

        // Check if both db1 and db2 are the same instance
        if (db1 == db2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}
