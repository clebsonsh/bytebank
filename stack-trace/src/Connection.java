public class Connection implements AutoCloseable {
    public Connection() {
        System.out.println("Opening Connection");
    }

    public void readData() {
        System.out.println("Reading Data");
        throw new IllegalStateException();
    }

    public void close() {
        System.out.println("Closing Connection");
    }
}
