package uceva.cleanarchitecture.infrastructure.datasource;

import com.github.javafaker.Faker;
import uceva.cleanarchitecture.domain.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VehicleDatasource {

    private Faker faker = new Faker();
    private final Random random = new Random();

    private final String[] categories = {
            "Sedan",
            "SUV",
            "Camioneta"
    };

    public List<Vehicle> getAll(int countVehicles){
        List<Vehicle> vehicles = new ArrayList<Vehicle>();

        for (int i = 1; i <= countVehicles; i++) {
            vehicles.add(generateVehicle(i));
        }

        return vehicles;
    }

    private Vehicle generateVehicle(Integer id){
        return new Vehicle(
                id,
                faker.company().name(), // brand
                randomCategory(),
                faker.number().numberBetween(1000, 100000), // price
                faker.number().numberBetween(1990, 2026) // year
        );
    }

    private String randomCategory() {
        return categories[random.nextInt(categories.length)];
    }
}