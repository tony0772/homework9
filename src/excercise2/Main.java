package excercise2;

public class Main {
    public static void main(String[] args) {
        Buquet buquet = new Buquet();

        buquet.addFlower("Rose");
        buquet.addFlower("Lily");
        buquet.addFlower("Tulip");
        buquet.addFlower("Orchid");

        System.out.println(buquet.getAll());
        buquet.removeFlower("Rose");
        System.out.println(buquet.getAll());
    }
}
