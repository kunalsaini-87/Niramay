package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.model.Deal;

public interface DealRepository extends JpaRepository<Deal,Long> {

}
