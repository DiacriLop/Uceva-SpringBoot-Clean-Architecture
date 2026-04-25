package uceva.cleanarchitecture.infrastructure.repository;

import java.util.List;

import uceva.cleanarchitecture.domain.entity.Dealership;
import uceva.cleanarchitecture.domain.repository.DealershipRepository;
import uceva.cleanarchitecture.infrastructure.datasource.DealershipDatasource;

public class DealershipRepositoryImpl extends DealershipRepository {

    private final DealershipDatasource dealershipDatasource;

    public DealershipRepositoryImpl(DealershipDatasource dealershipDatasource) {
        this.dealershipDatasource = dealershipDatasource;
    }

    @Override
    public List<Dealership> getAll(int countDealerships) {
        return dealershipDatasource.getAll(countDealerships);
    }
}

