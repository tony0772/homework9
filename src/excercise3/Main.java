package excercise3;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        company.employ(new Person("Marcel", 31, "Manager"));
        company.employ(new Person("Mihai", 24, "Welder"));
        company.employ(new Person("Andrei", 28, "Welder"));
        company.employ(new Person("Ionut", 40, "Welder"));
        company.employ(new Person("Ionel", 46, "Carpenter"));
        company.employ(new Person("Ionica", 22, "Carpenter"));
        company.employ(new Person("Ionescu", 50, "Carpenter"));
        company.employ(new Person("Marin", 33, "Plummer"));
        company.employ(new Person("Marius", 35, "Plummer"));
        company.employ(new Person("Mircea", 39, "Plummer"));

        System.out.println(company.getManager().getName());
        System.out.println(company.getPersons("Welder"));
        System.out.println(company.getPersonsOlder(30));
        System.out.println(company.getPerson("Ion"));

    }
}
