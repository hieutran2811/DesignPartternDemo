package BehavioralPatterns.MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class EditorHistory {
    private final List<TextMemento> mementos = new ArrayList<>();

    public void save(TextEditor editor) {
        mementos.add(editor.save());
    }

    public void undo(TextEditor editor) {
        if (mementos.isEmpty()) {
            System.out.println("No history to undo.");
            return;
        }
        TextMemento memento = mementos.remove(mementos.size() - 1);
        editor.restore(memento);
    }
}
