package exercise1;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();

        basket.addFruit("apple");
        basket.addFruit("pear");
        basket.addFruit("peach");
        basket.addFruit("cherry");
        basket.addFruit("grape");
        basket.addFruit("banana");
        basket.addFruit("strawberry");
        basket.addFruit("strawberry");
        basket.addFruit("mango");
        basket.addFruit("grape");
        basket.addFruit("banana");
        System.out.println(basket);

        System.out.println(basket.find("cherry"));
        System.out.println(basket.remove("apple"));
        System.out.println(basket.position("banana"));
        System.out.println(basket.distinct());
        System.out.println(basket.count());
        System.out.println(basket.customCount());

    }
}
