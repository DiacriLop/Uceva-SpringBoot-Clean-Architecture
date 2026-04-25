package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uceva.cleanarchitecture.application.usecase.GetAllVehiclesUseCase;
import uceva.cleanarchitecture.domain.entity.Vehicle;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final GetAllVehiclesUseCase getAllVehiclesUseCase;

    public VehicleController(GetAllVehiclesUseCase getAllVehiclesUseCase){
        this.getAllVehiclesUseCase = getAllVehiclesUseCase;
    }

    @GetMapping("/{countVehicles}")
    public List<Vehicle> getAll(@PathVariable int countVehicles) {
        return getAllVehiclesUseCase.execute(countVehicles);
    }
}
