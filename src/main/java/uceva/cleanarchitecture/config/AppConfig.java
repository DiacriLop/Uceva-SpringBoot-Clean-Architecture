package uceva.cleanarchitecture.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import uceva.cleanarchitecture.application.usecase.GetAllDealershipsUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllProductsUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllUsersUseCase;
import uceva.cleanarchitecture.application.usecase.GetAllVehiclesUseCase;
import uceva.cleanarchitecture.domain.repository.DealershipRepository;
import uceva.cleanarchitecture.domain.repository.ProductRepository;
import uceva.cleanarchitecture.domain.repository.UserRepository;
import uceva.cleanarchitecture.domain.repository.VehicleRepository;
import uceva.cleanarchitecture.infrastructure.datasource.DealershipDatasource;
import uceva.cleanarchitecture.infrastructure.datasource.ProductDatasource;
import uceva.cleanarchitecture.infrastructure.datasource.UserDatasource;
import uceva.cleanarchitecture.infrastructure.datasource.VehicleDatasource;
import uceva.cleanarchitecture.infrastructure.repository.DealershipRepositoryImpl;
import uceva.cleanarchitecture.infrastructure.repository.ProductRepositoryImpl;
import uceva.cleanarchitecture.infrastructure.repository.UserRepositoryImpl;
import uceva.cleanarchitecture.infrastructure.repository.VehicleRepositoryImpl;

@Configuration
public class AppConfig {

    // 🔹 DATASOURCES

    @Bean
    UserDatasource userDatasource(){
        return new UserDatasource();
    }

    @Bean
    ProductDatasource productDatasource(){
        return new ProductDatasource();
    }

    @Bean
    VehicleDatasource vehicleDatasource(){
        return new VehicleDatasource();
    }

    @Bean
    DealershipDatasource dealershipDatasource(){
        return new DealershipDatasource();
    }

    // 🔹 REPOSITORIES

    @Bean
    UserRepository userRepository(UserDatasource userDatasource) {
        return new UserRepositoryImpl(userDatasource);
    }

    @Bean
    ProductRepository productRepository(ProductDatasource productDatasource) {
        return new ProductRepositoryImpl(productDatasource);
    }

    @Bean
    VehicleRepository vehicleRepository(VehicleDatasource vehicleDatasource) {
        return new VehicleRepositoryImpl(vehicleDatasource);
    }

    @Bean
    DealershipRepository dealershipRepository(DealershipDatasource dealershipDatasource) {
        return new DealershipRepositoryImpl(dealershipDatasource);
    }

    // 🔹 USE CASES

    @Bean
    GetAllUsersUseCase getAllUsersUseCase(UserRepository userRepository) {
        return new GetAllUsersUseCase(userRepository);
    }

    @Bean
    GetAllProductsUseCase getAllProductsUseCase(ProductRepository productRepository) {
        return new GetAllProductsUseCase(productRepository);
    }

    @Bean
    GetAllVehiclesUseCase getAllVehiclesUseCase(VehicleRepository vehicleRepository) {
        return new GetAllVehiclesUseCase(vehicleRepository);
    }

    @Bean
    GetAllDealershipsUseCase getAllDealershipsUseCase(DealershipRepository dealershipRepository) {
        return new GetAllDealershipsUseCase(dealershipRepository);
    }
}
