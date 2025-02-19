package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.domain.AccountStatus;
import com.niramay.model.Seller;

import java.util.List;

public interface SellerRepository extends JpaRepository<Seller,Long> {

    Seller findByEmail(String email);
    List<Seller> findByAccountStatus(AccountStatus status);
}
