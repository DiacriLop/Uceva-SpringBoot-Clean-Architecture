package uceva.cleanarchitecture.application.usecase;

import java.util.List;

import uceva.cleanarchitecture.domain.entity.Dealership;
import uceva.cleanarchitecture.domain.repository.DealershipRepository;

public class GetAllDealershipsUseCase {
    private final DealershipRepository dealershipRepository;

    public GetAllDealershipsUseCase(DealershipRepository dealershipRepository){
        this.dealershipRepository = dealershipRepository;
    }

    public List<Dealership> execute(int countDealerships){
        return dealershipRepository.getAll(countDealerships);
    }
}
