public class Main {
    public static void main(String[] args) {
        Smartphone iphone = new Smartphone("iPhone");
        Smartphone samsung = new Smartphone("Samsung");
        Smartphone xiaomi = new Smartphone("Xiaomi");

        Father father = new Father("John", 42, "Smith", iphone, CarEnum.BMW, true);

        Son son1 = new Son("Henry", 20, "Smith", samsung, CarEnum.MERCEDES, true);
        Son son2 = new Son("George", 18, "Smith", xiaomi, CarEnum.TOYOTA, true);

        System.out.println("Father:");
        System.out.println(father.getInfo());
        System.out.println("Drive Car: " + father.driveCar());
        System.out.println("Drive Car with start command: " + father.driveCar("Start"));

        System.out.println("\nSon1:");
        System.out.println(son1.getInfo());
        System.out.println("Drive Car: " + son1.driveCar());

        System.out.println("\nSon2:");
        System.out.println(son2.getInfo());
        System.out.println("Drive Car: " + son2.driveCar());
    }
}