package com.application.myDocs.driver;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

	public Driver findByCnp(String cnp);

	public Set<Driver> findByIdIn(Set<Integer> driverIds);

}
