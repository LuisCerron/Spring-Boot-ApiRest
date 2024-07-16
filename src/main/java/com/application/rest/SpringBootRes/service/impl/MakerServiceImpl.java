package com.application.rest.SpringBootRes.service.impl;

import com.application.rest.SpringBootRes.entities.Maker;
import com.application.rest.SpringBootRes.persistence.IMakerDAO;
import com.application.rest.SpringBootRes.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerDAO makerDAO;

    @Override
    public List<Maker> findAll() {
        return makerDAO.findAll();
    }

    @Override
    public Optional<Maker> findByID(Long id) {
        return makerDAO.findByID(id);
    }

    @Override
    public void save(Maker maker) {
    makerDAO.save(maker);
    }

    @Override
    public void deleteById(Long id) {
    makerDAO.deleteById(id);
    }
}
