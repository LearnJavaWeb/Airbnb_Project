package com.example.login.service;

import com.example.login.model.House;

import java.util.Optional;

public interface HouseService {
    Iterable<House> findAll();
    Optional<House> findById(Long id);
    void save(House house);
    void remove(Long id);
}
