package com.application.rest.SpringBootRes.repository;

import com.application.rest.SpringBootRes.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends CrudRepository <Maker,Long>{
}
