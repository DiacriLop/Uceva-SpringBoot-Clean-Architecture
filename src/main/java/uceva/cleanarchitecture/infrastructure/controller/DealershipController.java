package uceva.cleanarchitecture.infrastructure.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import uceva.cleanarchitecture.application.usecase.GetAllDealershipsUseCase;
import uceva.cleanarchitecture.domain.entity.Dealership;

@RestController
@RequestMapping("/dealerships")
public class DealershipController {

    private final GetAllDealershipsUseCase getAllDealershipsUseCase;

    public DealershipController(GetAllDealershipsUseCase getAllDealershipsUseCase){
        this.getAllDealershipsUseCase = getAllDealershipsUseCase;
    }

    @GetMapping("/{countDealerships}")
    public List<Dealership> getAll(@PathVariable int countDealerships) {
        return getAllDealershipsUseCase.execute(countDealerships);
    }

}
