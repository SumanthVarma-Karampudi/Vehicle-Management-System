public class Car extends Engine implements Vehicle, GPS{                  
    private String brand;
    private String model;

    public Car(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    public void start() {
        System.out.println(brand + " " + model + " car is starting.");
    }

    public void stop() {
        System.out.println(brand + " " + model + " car is stopping.");
    }

    public void showLocation(){
        System.out.println("Car Location: Hyderabad, Telangana");
    }

    public void fuelType(){
        System.out.println("Fuel type is Diesel");
    }

    public void engineType(){
        System.out.println("It is an Inline engine");
    }

    public void displayDetails(){
        System.out.println("Car Brand "+ brand +", "+"Car Model "+model);
    }

}
