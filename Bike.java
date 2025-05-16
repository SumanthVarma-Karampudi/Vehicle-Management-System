public class Bike extends Engine implements Vehicle, GPS{                  
    private String brand;

    Bike(String brand){
        this.brand=brand;
    }

    public void start() {
        System.out.println(brand + " bike is starting.");
    }

    public void stop() {
        System.out.println(brand + " bike is stopping.");
    }

    public void showLocation(){
        System.out.println("Bike Location: Hyderabad, Telangana");
    }

    public void fuelType(){
        System.out.println("Fuel type is petrol");
    }

    public void engineType(){
        System.out.println("It is an single cylindrical engine");
    }

    @Override
    public void functionality(){
        System.out.println("Helps in movement");
    }

    public void displayDetails(){
        System.out.println("Bike Brand "+ brand );
    }

}


        
