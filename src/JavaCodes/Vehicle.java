package JavaCodes;


    // Sub Class and Super Class

    /*
    Super Class : ( Parent Class ) The class being inherited from

    Sub Class : ( Child Class ) The class that inherits from another class

     */


public class Vehicle {
    protected String brand = "Ford";
    protected String companyName = "Toyota";

    public void honk(){
        System.out.println("Tutt, Tuut !!!");

    }
}

class Car extends Vehicle{
    private String model = "1990";
    private int buyingDate = 2004;

    public static void main(String[] args) {
        Car car = new Car();
        car.honk();
        System.out.println(car.brand + " "  + car.buyingDate);
    }
}
