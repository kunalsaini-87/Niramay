package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
