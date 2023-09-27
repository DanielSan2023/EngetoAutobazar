import com.engeto.carmarket.Vehicle;
import com.engeto.carmarket.VehicleOffer;
import com.engeto.carmarket.VehicleType;

public class Main {
    public static void main(String[] args) {
        VehicleOffer offer = new VehicleOffer();
        offer.addCar(new Vehicle("Škoda Fabia", 55000, true, 5.7, VehicleType.CAR));
        offer.addCar(new Vehicle("Ford Ka", 50000, true, 5.3,VehicleType.VAN));
        System.out.println("Pocet predavanych vozidiel je :  "+offer.numberOfCars());;
        offer.printAllCars();

        offer.removeCar(new Vehicle("Škoda Fabia", 55000, true, 5.7, VehicleType.CAR));
        System.out.println("Pocet predavanych vozidiel je :  "+offer.numberOfCars());
        offer.printAllCars();



    }
}