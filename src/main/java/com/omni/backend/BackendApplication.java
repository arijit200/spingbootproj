package com.omni.backend;

import com.omni.backend.domain.Car;
import com.omni.backend.domain.CarRepository;
import com.omni.backend.domain.Owner;
import com.omni.backend.domain.OwnerRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;


@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(BackendApplication.class);

	private final CarRepository repository;
	private final OwnerRepository orepository;

	public BackendApplication(CarRepository repository, OwnerRepository orepository){
		this.repository = repository;
		this.orepository = orepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		Owner o1 = new Owner("Arijit", "Dutta");
		Owner o2 = new Owner("Rick", "Dutta");
		orepository.saveAll(Arrays.asList(o1,o2));

		repository.save(new Car("Ford", "Mustang", "Red",
				"ADF-1121", 2023, 59000, o1));
		repository.save(new Car("Nissan", "Leaf", "White",
				"SSJ-3002", 2020, 29000, o1));
		repository.save(new Car("Toyota", "Prius",
				"Silver", "KKO-0212", 2022, 39000, o2));


		for (Car car : repository.findAll()) {
			logger.info("brand: {}, model: {}", car.getBrand(), car.getModel());
		}
	}

}
