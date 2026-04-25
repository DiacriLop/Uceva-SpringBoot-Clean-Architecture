package uceva.cleanarchitecture.domain.repository;
import uceva.cleanarchitecture.domain.entity.Vehicle;

import java.util.List;

public abstract class VehicleRepository {
    public  abstract List<Vehicle> getAll(int coutVehicles);

}
