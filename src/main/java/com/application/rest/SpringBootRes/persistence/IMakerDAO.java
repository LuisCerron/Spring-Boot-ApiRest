package com.application.rest.SpringBootRes.persistence;

import com.application.rest.SpringBootRes.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    List<Maker> findAll();

    Optional<Maker> findByID(Long id);

    void save(Maker maker);

    void deleteById(Long id);

}
