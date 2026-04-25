# Clean Architecture en SpringBoot

```
src/main/java/uceva/cleanarchitecture
│
├── domain
│   ├── entity/
│   │   ├── User.java
│   │   ├── Product.java
│   │   └── Vehicle.java
│   │   └── Dealership.java
│   │
│   └── repository/
│       ├── UserRepository.java
│       ├── ProductRepository.java
│       └── VehicleRepository.java
│       └── DealershipRepository.java
│
├── application
│   └── usecase/
│       ├── GetAllUsersUseCase.java
│       ├── GetAllProductsUseCase.java
│       ├── GetAllVehiclesUseCase.java
│       └── GetAllDealershipsUseCase.java
│
├── infrastructure
│   ├── controller/
│   │   ├── UserController.java
│   │   └── ProductController.java
│   │   └── VehicleController.java
│   │   └── DealershipController.java
│   │
│   ├── repository/
│   │   ├── UserRepositoryImpl.java
│   │   └── ProductRepositoryImpl.java
│   │   └── VehicleRepositoryImpl.java
│   │   └── DealershipRepositoryImpl.java
│   │
│   └── datasource/
│       ├── UserDatasource.java
│       ├── ProductDatasource.java
│       ├── VehicleDatasource.java
│       └── DealershipDatasource.java
│
├── config
│   └── AppConfig.java
│
└── UcevaSprinBootTallerCleanArchitectureApplication.java
```


## Paso 1 - Crear Entidades

```
src/main/java/uceva/cleanarchitecture/domain/entity
├── User.java
├── Product.java
└── Vehicle.java
└── Dealership.java
```

## Paso 2 - Crear Repositorios

```
src/main/java/uceva/cleanarchitecture/domain/repositories/
├── UserRepository.java
├── ProductRepository.java
└── VehicleRepository.java
└── DealershipRepository.java
```

## Paso 3 - Crear Casos de Uso

```
src/main/java/uceva/cleanarchitecture/application/usecase/
├── GetAllUsersUseCase.java
├── GetAllProductsUseCase.java
├── GetAllVehiclesUseCase.java
└── GetAllDealershipsUseCase.java
```

## Paso 4 - Crear Controllers


```
src/main/java/uceva/cleanarchitecture/infrastructure/controllers/
├── UserController.java
├── ProductController.java
├── VehicleController.java
└── DealershipController.java
```

## Paso 5 - Crear Repositorios Implementadores

```
src/main/java/uceva/cleanarchitecture/infrastructure/repository/
├── UserRepositoryImpl.java
├── ProductRepositoryImpl.java
├── VehicleRepositoryImpl.java
└── DealershipRepositoryImpl.java
```

## Paso 6 - Agregar la Inyección de Dependencias

```
src/main/java/uceva/cleanarchitecture/config/
└── AppConfig.java
```

# Funcionamiento del Backend

## Urls Consumo
```
http://localhost:3000/api/swagger-ui/index.html
http://localhost:8080/api/users/{countUsers}
http://localhost:8080/api/products/{countProducts}
http://localhost:8080/api/vehicles/{countVehicles}
http://localhost:8080/api/dealerships/{countDealerships}
```
