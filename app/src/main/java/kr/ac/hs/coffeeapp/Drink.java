package kr.ac.hs.coffeeapp;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //Drink table
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk",
                    R.drawable.latte),
            new Drink("Cappuccino", "A couple of espresso shots with steamed milk",
                    R.drawable.cappuccino),
            new Drink("Filter", "A couple of espresso shots with steamed milk",
                    R.drawable.filter)
    };

    //Each Drink has a name, description, and an image resource
    private Drink(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }

}
