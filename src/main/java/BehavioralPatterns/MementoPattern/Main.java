package BehavioralPatterns.MementoPattern;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        EditorHistory history = new EditorHistory();

        editor.setContent("Version 1");
        history.save(editor); // Lưu phiên bản 1

        editor.setContent("Version 2");
        history.save(editor); // Lưu phiên bản 2

        editor.setContent("Version 3");
        System.out.println("Current content: " + editor.getContent()); // Output: Current content: Version 3

        // Khôi phục về phiên bản trước
        history.undo(editor);
        System.out.println("After undo: " + editor.getContent()); // Output: After undo: Version 2

        // Khôi phục về phiên bản trước nữa
        history.undo(editor);
        System.out.println("After another undo: " + editor.getContent()); // Output: After another undo: Version 1

        // Thử khôi phục khi không còn lịch sử
        history.undo(editor);
    }
}
