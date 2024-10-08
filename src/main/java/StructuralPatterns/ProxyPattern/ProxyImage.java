package StructuralPatterns.ProxyPattern;

public class ProxyImage implements Image{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);  // Khởi tạo đối tượng thật khi cần
        }
        realImage.display();  // Chuyển tiếp yêu cầu tới đối tượng thật
    }
}
