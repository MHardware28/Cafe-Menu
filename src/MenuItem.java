public class MenuItem {
    public String m_name;
    public double m_price;
    public String m_category;

    public MenuItem(String name,double price,String category){
        this.m_name = name;
        this.m_price = price;
        this.m_category = category;
    }

    public void setName(String name){
        this.m_name = name;
    }
    public String getName(){
        return m_name;
    }
    public void setPrice(double price){
        this.m_price = price;
    }
    public double getPrice(){
        return m_price;
    }
    public void setCategory(String category){
        this.m_category = category;
    }
    public String getCategory(){
        return m_category;
    }

    public void displayItemInfo(){
        System.out.println("Menu Item name: " + m_name);
        System.out.println("Menu Item price: " + m_price);
        System.out.println("Menu Item category: " + m_category);
    }

    /**
     * This is part of the code creates an object of type MenuItem and then displays information for it based on the displayinfo method.
     * @param args
     */
    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem("Cappuccino",3.50, "Beverage");

        menuItem.displayItemInfo();
    }
}
