package StructuralPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");

        // Hình ảnh sẽ chỉ được tải khi gọi phương thức display
        System.out.println("Image will be loaded and displayed only when needed.");
        image.display();  // Lần đầu gọi, hình ảnh sẽ được tải và hiển thị

        System.out.println("\nReusing the same image:");
        image.display();  // Lần thứ hai gọi, hình ảnh sẽ không tải lại mà chỉ hiển thị
    }
}
