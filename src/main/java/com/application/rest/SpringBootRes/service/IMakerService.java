package com.application.rest.SpringBootRes.service;

import com.application.rest.SpringBootRes.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerService {

    List<Maker> findAll();

    Optional<Maker> findByID(Long id);

    void save(Maker maker);

    void deleteById(Long id);

}
