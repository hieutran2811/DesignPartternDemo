package BehavioralPatterns.MementoPattern;

public class TextEditor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // Tạo memento để lưu trữ trạng thái
    public TextMemento save() {
        return new TextMemento(content);
    }

    // Khôi phục trạng thái từ memento
    public void restore(TextMemento memento) {
        content = memento.getContent();
    }
}
