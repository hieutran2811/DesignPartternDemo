package CreationalPatterns.Singleton;

public class DatabaseConnection {
    // Biến lưu trữ instance duy nhất
    private static DatabaseConnection instance;

    // Hàm khởi tạo private để ngăn không cho tạo instance bên ngoài
    private DatabaseConnection() {
        // Kết nối tới cơ sở dữ liệu
        System.out.println("Đang kết nối cơ sở dữ liệu...");
    }

    // Phương thức public để lấy instance duy nhất
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Ví dụ phương thức thực hiện truy vấn
    public void query(String sql) {
        System.out.println("Thực hiện truy vấn: " + sql);
    }
}

