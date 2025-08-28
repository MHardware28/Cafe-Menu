public class Order {
    public MenuItem item1;
    public MenuItem item2;
    public MenuItem item3;
    public double totalAmt;


    /**
     * Using null within the constructor allows for there to be an empty space that an item can be added to.
     */
    public Order(){
        this.item1 = null;
        this.item2 = null;
        this.item3 = null;
        this.totalAmt = 0.0;
    }

    public void addItem1(MenuItem item) {
        this.item1 = item;
    }
    public void addItem2(MenuItem item) {
        this.item2 = item;
    }
    public void addItem3(MenuItem item) {
        this.item3 = item;
    }

    /**
     * This calculates the total amount of the order by summing the prices
     * of all non-null items.
     */
    public void calculateTotal() {
        double calculatedTotal = 0.0;
        if (this.item1 != null) {
            calculatedTotal += this.item1.getPrice();
        }
        if (this.item2 != null) {
            calculatedTotal += this.item2.getPrice();
        }
        if (this.item3 != null) {
            calculatedTotal += this.item3.getPrice();
        }
        this.totalAmt = calculatedTotal;
    }

    public void displayOrderDetails() {
        System.out.println("******** Order Details ********");

        // Display details for each item if it exists
        if (this.item1 != null) {
            System.out.println("Item 1:");
            this.item1.displayItemInfo();
        }
        if (this.item2 != null) {
            System.out.println("Item 2:");
            this.item2.displayItemInfo();
        }
        if (this.item3 != null) {
            System.out.println("Item 3:");
            this.item3.displayItemInfo();
        }

        // This displays the final total
        System.out.println("***********************");
        System.out.printf("Total Amount: $%.2f%n", this.totalAmt);
        System.out.println("***********************");
    }
    public static void main(String[] args){
        MenuItem coffee = new MenuItem("Cappuccino", 3.50, "Beverage");
        MenuItem sandwich = new MenuItem("BLT", 5.00, "Sandwich");
        MenuItem fries = new MenuItem("Curly Fries", 2.90, "Sides");

        Order myOrder = new Order();

        myOrder.addItem1(coffee);
        myOrder.addItem2(sandwich);
        myOrder.addItem3(fries);

        // Calculates the total amount
        myOrder.calculateTotal();

        // Displays the order details
        myOrder.displayOrderDetails();
    }

}
