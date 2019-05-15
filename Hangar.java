public class Hangar {
    public static void main(String[] args) {

        Car crz = new Car("Honda CR-Z");
        Car visa = new Car("Citroën Visa");
        Boat catamaran = new Boat("Leopard Catamaran");
        Boat yacht = new Boat("Chaparral Yacht");

        System.out.println(crz.doStuff());
        System.out.println(visa.doStuff());
        System.out.println(catamaran.doStuff());
        System.out.println(yacht.doStuff());

    }
}