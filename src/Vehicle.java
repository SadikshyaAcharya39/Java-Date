public class Vehicle {
    protected String brand;
    protected String company;

     protected void sound(){
        System.out.println("Tutttt tuttt !!!");
    }

    protected Vehicle(String brand, String company){
         this.brand = brand;
         this.company = company;

    }

     public class Car extends Vehicle{
        String model;
        String date;

        protected Car(String brand, String company, String model, String date){
            super(brand, company);
            this.model = model;
            this.date = date;
        }

    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("AAA", "Ford");
        Car car = vehicle.new Car("AAAAA", "Hyundai", "Creta EV", "2004-01-02");
        car.sound();
        System.out.println("Brand: " + car.brand + " " + "Company: " + car.company + " " + "Model: " + car.model + "  " + "Date:  " + car.date);
    }
}
