package com.application.myDocs.car;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

	public Car findByRegistrationNo(String registrationNo);
}
