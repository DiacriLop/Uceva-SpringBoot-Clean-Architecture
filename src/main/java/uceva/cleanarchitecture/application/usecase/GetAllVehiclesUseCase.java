package uceva.cleanarchitecture.application.usecase;

import uceva.cleanarchitecture.domain.entity.Product;
import uceva.cleanarchitecture.domain.entity.Vehicle;
import uceva.cleanarchitecture.domain.repository.ProductRepository;
import uceva.cleanarchitecture.domain.repository.VehicleRepository;

import java.util.List;

public class GetAllVehiclesUseCase {
    private final VehicleRepository vehicleRepository;

    public GetAllVehiclesUseCase(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> execute(int countVehicles){
        return vehicleRepository.getAll(countVehicles);
    }
}
