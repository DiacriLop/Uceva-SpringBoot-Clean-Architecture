package uceva.cleanarchitecture.domain.repository;

import uceva.cleanarchitecture.domain.entity.Dealership;

import java.util.List;

public abstract class DealershipRepository {

    /**
     * Obtiene todos los concesionarios.
     *
     * @param countDealerships Número máximo de concesionarios a obtener
     * @return Lista de concesionarios
     */
    public abstract List<Dealership> getAll(int countDealerships);
}