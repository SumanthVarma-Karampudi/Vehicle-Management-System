import java.util.Scanner;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        Car car = null;
        Bike bike = null;
        System.out.println("===== Vehicle Management System =====");
        System.out.println("Choose a vehicle to manage:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.print("Enter your choice 1 or 2: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Enter Car Brand: ");
                String carBrand = scanner.nextLine();
                System.out.print("Enter Car Model: ");
                String carModel = scanner.nextLine();
                car = new Car(carBrand, carModel);
                break;

            case 2:
                System.out.print("Enter Bike Brand: ");
                String bikeBrand = scanner.nextLine();
                bike = new Bike(bikeBrand);
                break;

            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }
        System.out.println("\n--- Actions ---");
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Start Vehicle");
            System.out.println("2. Stop Vehicle");
            System.out.println("3. Show Fuel Type");
            System.out.println("4. Show Engine Type");
            System.out.println("5. Check Functionality");
            System.out.println("6. Show GPS Location");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int action = scanner.nextInt();

            if (car != null) {
                switch (action) {
                    case 1:
                        car.start();
                        break;

                    case 2:
                        car.stop();
                        break;

                    case 3:
                        car.fuelType();
                        break;

                    case 4:
                        car.engineType();
                        break;

                    case 5:
                        car.functionality();
                        break;

                    case 6:
                        car.showLocation();
                        break;

                    case 0:
                        System.out.println("Exiting Vehicle Management System. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println(" action not valid.");
                }
            } else if (bike != null) {
                switch (action) {
                    case 1:
                        bike.start();
                        break;

                    case 2:
                        bike.stop();
                        break;

                    case 3:
                        bike.fuelType();
                        break;

                    case 4:
                        bike.engineType();
                        break;

                    case 5:
                        bike.functionality();
                        break;

                    case 6:
                        bike.showLocation();
                        break;

                    case 0:
                        System.out.println("Exiting Vehicle Management System. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid action.");
                }
            }
        }
    }
}



