package com.quintech.app.Mappers;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
    Customer customer;
    Address billingAddress;
}




