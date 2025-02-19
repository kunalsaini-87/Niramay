package com.niramay.response;

import com.niramay.dto.OrderHistory;
import com.niramay.model.Cart;
import com.niramay.model.Order;
import com.niramay.model.Product;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FunctionResponse {
    private String functionName;
    private Cart userCart;
    private OrderHistory orderHistory;
    private Product product;
}
