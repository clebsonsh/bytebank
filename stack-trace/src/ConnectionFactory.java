public class ConnectionFactory {
    public static void main(String[] args) {
        Connection connection = new Connection();
        try {
            connection.readData();
        } catch (IllegalStateException e) {
            System.out.println("Connection failed");
        } finally {
            connection.close();
        }
    }
}
