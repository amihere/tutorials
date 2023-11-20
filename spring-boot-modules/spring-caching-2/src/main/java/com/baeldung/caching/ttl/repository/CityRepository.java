package com.baeldung.caching.ttl.repository;

import com.baeldung.caching.ttl.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {}