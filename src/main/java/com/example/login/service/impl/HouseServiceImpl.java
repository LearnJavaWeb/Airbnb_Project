package com.example.login.service.impl;

import com.example.login.model.House;
import com.example.login.repository.HouseRepository;
import com.example.login.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service("houseService")
public class HouseServiceImpl implements HouseService {
    private HouseRepository houseRepository;

    @Autowired
    public HouseServiceImpl(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public Iterable<House> findAll() {
        return houseRepository.findAll();
    }

    @Override
    public Optional<House> findById(Long id) {
        return houseRepository.findById(id);
    }

    @Override
    public void save(House house) {
        houseRepository.save(house);
    }

    @Override
    public void remove(Long id) {
        houseRepository.deleteById(id);
    }
}
