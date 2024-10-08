package CreationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        // Lấy instance duy nhất của DatabaseConnection
        DatabaseConnection connection = DatabaseConnection.getInstance();

        // Sử dụng connection để thực hiện các truy vấn
        connection.query("SELECT * FROM users");

        // Kiểm tra Singleton
        DatabaseConnection anotherConnection = DatabaseConnection.getInstance();
        System.out.println(connection == anotherConnection); // Kết quả là true
    }
}
