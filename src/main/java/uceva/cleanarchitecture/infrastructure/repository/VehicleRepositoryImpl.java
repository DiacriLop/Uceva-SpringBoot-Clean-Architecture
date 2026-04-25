package uceva.cleanarchitecture.infrastructure.repository;

import uceva.cleanarchitecture.domain.entity.Vehicle;
import uceva.cleanarchitecture.domain.repository.VehicleRepository;
import uceva.cleanarchitecture.infrastructure.datasource.VehicleDatasource;

import java.util.List;

public class VehicleRepositoryImpl extends VehicleRepository {

    private final VehicleDatasource vehicleDatasource;

    public VehicleRepositoryImpl(VehicleDatasource vehicleDatasource) {
        this.vehicleDatasource = vehicleDatasource;
    }

    @Override
    public List<Vehicle> getAll(int countVehicles) {
        return vehicleDatasource.getAll(countVehicles);
    }
}
