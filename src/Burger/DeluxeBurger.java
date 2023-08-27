package Burger;

public class DeluxeBurger extends Hamburger{

    private String drink;
    private String cips;

    public DeluxeBurger() {
        super("Deluxe Burger", 19.10, "Normal");
        super.setMeat("Smash");
    }


    @Override
    public void addHamburgerAddition1(String addition, double price) {
        System.out.println("Deluxe Burger içine yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition, double price) {
        System.out.println("Deluxe Burger içine malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition, double price) {
        System.out.println("Deluxe Burger içine malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition, double price) {
        System.out.println("Deluxe Burger içine malzeme eklenemez.");
    }
}
