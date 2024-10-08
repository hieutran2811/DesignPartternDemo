package BehavioralPatterns.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareRecipe(); // Pha cà phê

        System.out.println(); // Ngắt dòng

        Beverage tea = new Tea();
        tea.prepareRecipe(); // Pha trà
    }
}
