package com.niramay.service;

import java.util.List;

import com.niramay.model.Order;
import com.niramay.model.Seller;
import com.niramay.model.Transaction;
import com.niramay.model.User;

public interface TransactionService {

    Transaction createTransaction(Order order);
    List<Transaction> getTransactionBySeller(Seller seller);
    List<Transaction>getAllTransactions();
}
