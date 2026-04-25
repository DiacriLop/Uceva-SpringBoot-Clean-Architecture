package uceva.cleanarchitecture.domain.entity;

public class Dealership {
    /** Identificador único del concesionario */
    public Integer id;
    /** Nombre del concesionario */
    public String name;
    /** Ubicación del concesionario */
    public String location;
    /** Continente donde se encuentra el concesionario */
    public String continent;

    public Dealership(Integer id, String name, String location, String continent){
        this.id = id;
        this.name = name;
        this.location = location;
        this.continent = continent;
    }
}
