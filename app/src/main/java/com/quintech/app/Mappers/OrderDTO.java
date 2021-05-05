package com.quintech.app.Mappers;

import lombok.Data;

@Data
public class OrderDTO { 
    String customerFirstName;
    String customerLastName;
    String billingStreet;
    String billingCity;
}