package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.domain.PayoutsStatus;
import com.niramay.model.Payouts;

import java.util.List;

public interface PayoutsRepository extends JpaRepository<Payouts,Long> {

    List<Payouts> findPayoutsBySellerId(Long sellerId);
    List<Payouts> findAllByStatus(PayoutsStatus status);
}
