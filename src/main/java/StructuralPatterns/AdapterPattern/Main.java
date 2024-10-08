package StructuralPatterns.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        SquarePeg squarePeg = new SquarePeg();
        RoundHole adapter = new SquarePegAdapter(squarePeg);
        adapter.fit();  // Inserting square peg
    }
}
