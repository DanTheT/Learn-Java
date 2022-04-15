public class Drinks {
    private String name;
    private String details;
    private Double price;

    public Drinks(String name, String details, Double price) {
        this.name = name;
        this.details = details;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getDetails() {
        return details;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("Drink name: " + this.getName() + "\n" +
                "Details: " + this.getDetails() + "\n" +
                "Price: RM" + this.getPrice());
    }
}
