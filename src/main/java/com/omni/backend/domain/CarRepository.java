package com.omni.backend.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
//    //find cars by brand
//    List<Car> findByBrand(String brand);
//
//    // find cars by modelYear
//    List<Car> findByModelYear(String modelYear);
//
//    // Fetch cars by brand and model
//    List<Car> findByBrandAndModel(String brand, String model);
//
//    // Fetch cars by brand or color
//    List<Car> findByBrandOrColor(String brand, String color);
//
//    // fetch cars using query
//    @Query("select c from Car c where c.brand='Lambo'")
//    List<Car> findByBrandQuery(String brand);
}
