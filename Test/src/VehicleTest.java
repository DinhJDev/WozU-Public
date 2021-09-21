import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userMake = sc.nextLine();
        String userModel = sc.nextLine();
        int userNumOfDoors = sc.nextInt();
        int userWheels = sc.nextInt();
        int userMaxPassengers = sc.nextInt();

        Vehicle vehicle = new Vehicle(userMake, userModel, userNumOfDoors, userWheels, userMaxPassengers);

        vehicle.exhaustNoise();

        System.out.println(vehicle.getMake());
    }
}
