package advanced.enumcoding;

public class Pizza {

    private String name;
    private PizzaSize pizzaSize;
    private double price;

    public Pizza(String name, PizzaSize pizzaSize) {
        this.name = name;
        this.pizzaSize = pizzaSize;
        this.price = calculatePrice();
    }

    private double calculatePrice() {
        switch(pizzaSize) {
            case SMALL:
            default:
               return 5.99;
            case MEDIUM:
                return 6.99;
            case LARGE:
                return 8.99;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public PizzaSize getPizzaSize() {
        return pizzaSize;
    }

    public static void main(String[] args) {
        System.out.println(new Pizza("Margherita", PizzaSize.SMALL).getPrice());

    }
}
