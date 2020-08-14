public class Order {
    private Restaurant restaurant;
    private Menuselect menuselect;

    Order( Restaurant restaurant,Menuselect menuselect){
        this.restaurant = restaurant;
        this.menuselect= menuselect;
    }

    public Restaurant getRestaurant() {
        return this.restaurant;
    }

    public Menuselect getMenuselect() {
        return this.menuselect;
    }
}