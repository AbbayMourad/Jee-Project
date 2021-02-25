package com.project.main.repositories;

import java.util.List;

import com.project.main.models.OfferResponsibility;

import org.springframework.data.repository.CrudRepository;

public interface OfferResponsibilityRepository extends CrudRepository<OfferResponsibility, Integer> {
  
  List<OfferResponsibility> findByOfferId(int id);
}
