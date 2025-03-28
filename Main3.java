
abstract class Vehicle {
    abstract void start();  //Abstract method(no implementation)

    void stop() { //Concrete method with a message
        System.out.println("Vehicle stopped."); 
    }
}

class Car extends Vehicle {
    void start() {   // Implementing abstract method
        System.out.println("Car started with a key.");
    }
}
public class Main3 {
   public static void main(String[] args) {
    //Creating a Car object
    Car car = new Car();

    // Calling methods
    car.start();   //Calls the overriden method in Car
    car.stop();    // Calls the inherited method from Vehicle
   }
}