package com.project.main.repositories;

import java.util.List;

import com.project.main.models.OfferSkill;

import org.springframework.data.repository.CrudRepository;

public interface OfferSkillRepository extends CrudRepository<OfferSkill, Integer> {

  // List<OfferSkill> findNameAndLevelByOfferId(int id);
  List<OfferSkill> findAll();

  List<OfferSkill> findByOfferId(int id);
}
