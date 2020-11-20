public class Car {

    String carName = "Civic";
    String carModel ;

    public void Carname() {
        System.out.println(carName);
    }

}

class InnerCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.Carname();
        System.out.println(c.carName); 
        System.out.println(c.carModel); 
    }

}
