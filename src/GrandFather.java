public class GrandFather implements Family{
    private String name;
    private int age;
    private String surname;
    private Smartphone smartphone;
    private CarEnum car;

    public GrandFather(String name, int age, String surname,
                       Smartphone smartphone, CarEnum car) {
        this.name = name;
        this.age = age;
        this.surname = surname;
        this.smartphone = smartphone;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public Smartphone getSmartphone() {
        return smartphone;
    }

    public CarEnum getCar() {
        return car;
    }

    public String getInfo(){
        return "Name: " + name + "Age: " + age + ", Surname: " + surname
                + "Smartphone: " + smartphone + ", Car: " + car;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
