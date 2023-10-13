   class Donut {
     String type;
     int calories;
     double price;
     String description;

    // Constructor
     Donut(String type, int calories, double price, String description) {
        this.type = type;
        this.calories = calories;
        this.price = price;
        this.description = description;
    }

    @Override
     public String toString() {
        return "Donut{" +
                "type='" + type + '\'' +
                ", calories=" + calories +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

       // Getter for price (for extra credit part)
        double getPrice() {
           return price;
       }


}


public class Main {
    public static void main(String[] args) {
        // Create at least 6 donuts
        Donut donut1 = new Donut("Glazed", 260, 1.50, "Classic glazed donut");
        Donut donut2 = new Donut("Chocolate", 300, 1.75, "Chocolate frosted donut");
        Donut donut3 = new Donut("Jelly", 280, 1.80, "Filled with berry jam");
        Donut donut4 = new Donut("Boston Cream", 290, 2.00, "Filled with custard and chocolate on top");
        Donut donut5 = new Donut("Sugar", 250, 1.50, "Coated with granulated sugar");
        Donut donut6 = new Donut("Sprinkled", 270, 1.60, "Fun donut with rainbow sprinkles");

        // Save them in an array
        Donut[] donuts = {donut1, donut2, donut3, donut4, donut5, donut6};

// Loop through the array and print out the donut
        double total = 0.0;
        for(Donut donut : donuts) {
            System.out.println(donut);
            total += donut.getPrice();
        }

        // Extra Credit: Print out the total price for the donuts
        System.out.println("Total price for all donuts: $" + total);


    }
}
