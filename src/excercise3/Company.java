package excercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> persons = new ArrayList<>();
    public Person getManager(){
        for (Person person : persons){
            if ("Manager".equalsIgnoreCase(person.getPosition())){
                return person;
            }
        }
        return null;
    }
    public List<Person> getPersons(String profession){
        List<Person> result = new ArrayList<>();
        for (Person person : persons){
            if (profession.equalsIgnoreCase(person.getPosition())){
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> getPersonsOlder(int age){
        List<Person> result = new ArrayList<>();
        for (Person person : persons){
            if (person.getAge() > age){
                result.add(person);
            }
        }
        return result;
    }
    public List<Person> getPerson(String filterName){
        List<Person> result = new ArrayList<>();
        for (Person person : persons){
            if (person.getName().contains(filterName)){
                result.add(person);
            }
        }
        return result;
    }
    public void employ(Person person){
        persons.add(person);
    }
}
