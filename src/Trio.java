public class Trio implements MenuItem {
    private Sandwich sammy;
    private Salad sally;
    private Drink drinky;

    public Trio(Sandwich sam, Salad sal, Drink dri) {
        sammy = sam;
        sally = sal;
        drinky = dri;
    }

    public String getName() {
        return sammy.getName() + "/" + sally.getName() + "/" + drinky.getName() + " Trio";
    }

    public double getPrice() {
        double price = sammy.getPrice() + sally.getPrice() + drinky.getPrice();
        price -= Math.min(sammy.getPrice(), Math.min(sally.getPrice(), drinky.getPrice()));
        return price;
    }
}
