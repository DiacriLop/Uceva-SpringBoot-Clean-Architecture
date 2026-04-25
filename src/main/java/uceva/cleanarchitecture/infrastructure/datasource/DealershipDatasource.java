package uceva.cleanarchitecture.infrastructure.datasource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.javafaker.Faker;

import uceva.cleanarchitecture.domain.entity.Dealership;

public class DealershipDatasource {

    private Faker faker = new Faker();
    private final Random random = new Random();

    private final String[] continents = {
            "America",
            "Europe",
            "Asia",
            "Africa",
            "Oceania"
    };

    public List<Dealership> getAll(int countDealerships) {
        List<Dealership> dealerships = new ArrayList<Dealership>();

        for (int i = 1; i <= countDealerships; i++) {
            dealerships.add(generateDealership(i));
        }

        return dealerships;
    }

    private Dealership generateDealership(Integer id) {
        return new Dealership(
                id,
                faker.company().name(), // name
                faker.address().country(), // location
                randomContinent() // continent
        );
    }

    private String randomContinent() {
        return continents[random.nextInt(continents.length)];
    }

}
