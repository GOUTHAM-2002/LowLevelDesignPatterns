public class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Connecting to the datbase........");
    }
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();

        }
        return instance;
    }

    public void query(String sql) {
        // Simulate a query being executed on a database
        System.out.println("Executing query: " + sql);
    }

}
