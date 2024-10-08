package BehavioralPatterns.TemplateMethod;

public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Các bước chung
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Các bước cụ thể sẽ được triển khai trong lớp con
    protected abstract void brew();
    protected abstract void addCondiments();
}
