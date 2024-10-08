package StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private List<Graphic> childGraphics = new ArrayList<>();

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void draw() {
        for (Graphic graphic : childGraphics) {
            graphic.draw();
        }
    }
}
