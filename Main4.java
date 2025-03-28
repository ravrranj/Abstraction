
abstract class Appliance {
    abstract void turnOn();

    void turnOff(){
        System.out.println("Appliance is turned off");
    }
}
class Fan extends Appliance {

void turnOn() {
    System.out.println("Fan is running");
  }
}

public class Main4 {
    public static void main(String args[]) {
        //creating a fan object
        Fan fan = new Fan();

        fan.turnOn();
        fan.turnOff();
    }
}