public class ConnectionFactory {
    public static void main(String[] args) {
        try (Connection connection = new Connection()) {
            connection.readData();
        } catch (IllegalStateException e) {
            System.out.println("Connection failed");
        }
    }
}
