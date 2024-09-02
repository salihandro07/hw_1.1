public class Father extends GrandFather implements Family{
    private boolean driveCar = true;
    public Father(String name, int age, String surname, Smartphone smartphone, CarEnum car, boolean driveCar) {
        super(name, age, surname, smartphone, car);
        this.driveCar = false;
    }

    public boolean driveCar() {
        if (driveCar == true) {
            System.out.println("машина поехала");
        }else{
            System.out.println("машина заглохла");
        }
        return false;
    }

    final public boolean driveCar(String start){
        System.out.println("Машина поехала");
        return false;
    }



    @Override
    public String toString() {
        return super.toString();
    }
}