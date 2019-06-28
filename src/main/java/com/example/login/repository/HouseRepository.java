package com.example.login.repository;

import com.example.login.model.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("houseRepository")
public interface HouseRepository extends CrudRepository<House, Long> {
}
