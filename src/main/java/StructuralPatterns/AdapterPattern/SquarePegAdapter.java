package StructuralPatterns.AdapterPattern;

public class SquarePegAdapter implements RoundHole{
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public void fit() {
        squarePeg.insert();
    }
}
