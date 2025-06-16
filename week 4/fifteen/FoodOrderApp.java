/*
15. Food Ordering App

Instructions:

    Class FoodItem: private fields name, price
    Subclasses:
        Pizza: add size, toppings[]
        Burger: add cheese, pattyType
        Salad: add ingredients[]
    Use encapsulation and override method displayMenuItem()
    File: FoodOrderApp.java.

 */
class FoodItem {
    private String name;
    private double price;
    
    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }    
    public void displayMenuItem() {
        System.out.println("Name: " + name);
        System.out.println("Price: Rs." + price);
    }
}

class Pizza extends FoodItem {
    private String size;
    private String[] toppings;
    
    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }
    
    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + String.join(", ", toppings));
    }
}

class Burger extends FoodItem {
    private boolean cheese;
    private String pattyType;
    
    public Burger(String name, double price, boolean cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }
    
    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println("Cheese: " + (cheese ? "Yes" : "No"));
        System.out.println("Patty Type: " + pattyType);
    }
}

class Salad extends FoodItem {
    private String[] ingredients;
    
    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }
    
    @Override
    public void displayMenuItem() {
        super.displayMenuItem();
        System.out.println("Ingredients: " + String.join(", ", ingredients));
    }
}

class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem[] menu = new FoodItem[3];
        menu[0] = new Pizza("Margherita", 1249, "Medium", new String[]{"Tomato", "Mozzarella", "Basil"});
        menu[1] = new Burger("Classic", 891, true, "Beef");
        menu[2] = new Salad("Caesar", 737, new String[]{"Lettuce", "Croutons", "Parmesan", "Caesar Dressing"});
        
        System.out.println("Menu Items:");
        for (FoodItem item : menu) {
            item.displayMenuItem();
            System.out.println();
        }
    }
}
