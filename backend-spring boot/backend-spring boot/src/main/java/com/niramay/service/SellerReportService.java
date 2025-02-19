package com.niramay.service;

import java.util.List;
import java.util.Optional;

import com.niramay.model.Seller;
import com.niramay.model.SellerReport;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
