public class Cafe {

    public MenuItem menuItem1;
    public MenuItem menuItem2;
    public MenuItem menuItem3;
    public Order currentOrder;

    /**
     * Using null within the constructor allows for there to be an empty space that an item can be added to.
     */
    public Cafe() {
        this.menuItem1 = null;
        this.menuItem2 = null;
        this.menuItem3 = null;
        this.currentOrder = null;
    }

        public void addMenuItem1(MenuItem item) {
            this.menuItem1 = item;
        }
        public void addMenuItem2(MenuItem item){
            this.menuItem2 = item;
        }
        public void addMenuItem3(MenuItem item){
            this.menuItem3 = item;
        }
        public void placeOrder(Order order){
            this.currentOrder = order;
            this.currentOrder.calculateTotal();
        }

    /**
     * This displays the cafe's menu
     */
    public void displayMenu() {
            System.out.println("******** Cafe Menu ********");
            if (this.menuItem1 != null) {
                this.menuItem1.displayItemInfo();
                System.out.println();
            }
            if (this.menuItem2 != null) {
                this.menuItem2.displayItemInfo();
                System.out.println();
            }
            if (this.menuItem3 != null) {
                this.menuItem3.displayItemInfo();
                System.out.println();
            }
            System.out.println("*******************");
        }
    public static void main(String[] args){
        Cafe myCafe = new Cafe();

        MenuItem cupcake = new MenuItem("Cupcake", 4.00,"Pastry");
        MenuItem salad = new MenuItem("Caesar", 6.50, "Lunch");
        MenuItem sandwich = new MenuItem("BLT", 5.00, "Sandwich");
        MenuItem fries = new MenuItem("Curly Fries", 2.90, "Sides");

        myCafe.addMenuItem1(cupcake);
        myCafe.addMenuItem1(salad);
        myCafe.addMenuItem1(sandwich);
        /**
         * This is to print out the menu items and all their information.
         */
        myCafe.displayMenu();

        Order customerOrder = new Order();
        myCafe.placeOrder(customerOrder);
        myCafe.currentOrder.displayOrderDetails();

    }
}
