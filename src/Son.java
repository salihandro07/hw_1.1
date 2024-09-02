final public class Son extends Father implements Family{
    public Son(String name, int age, String surname, Smartphone smartphone, CarEnum car, boolean driveCar) {
        super(name, age, surname, smartphone, car, driveCar);
    }

    @Override
    public boolean driveCar() {
        System.out.println("Нет топлива");
        super.driveCar();
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
