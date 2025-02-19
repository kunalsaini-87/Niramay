package com.niramay.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niramay.model.SellerReport;

public interface SellerReportRepository extends JpaRepository<SellerReport,Long> {
    SellerReport findBySellerId(Long sellerId);
}
