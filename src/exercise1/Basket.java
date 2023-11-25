package exercise1;

import java.util.*;

public class Basket {
    private List<String> fruits;
    public Basket(){
        fruits = new ArrayList<>();
    }
    public void addFruit(String fruit) {
        fruits.add(fruit);
    }
    public boolean find(String fruit){
        return fruits.contains(fruit);
    }
    public boolean remove(String fruit){
        return fruits.remove(fruit);
    }
    public int position(String fruit){
        return fruits.indexOf(fruit);
    }
    public Collection<String> distinct() {
        Set<String> uniqueFruits = new HashSet<>(fruits);
        return uniqueFruits;
    }
    public int count(){
        return fruits.size();
    }
    public int customCount(){
        int count = 0;
        for (String fruit : fruits){
            count++;
        }
        return count;
    }

}
