package excercise2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Buquet {
    private Set<String> flowers;
    public Buquet(){
        this.flowers = new HashSet<>();
    }
    public Collection<String> getAll(){
        return flowers;
    }
    public void addFlower(String flower){
        flowers.add(flower);
    }
    public void removeFlower(String flower){
        flowers.remove(flower);
    }

}
