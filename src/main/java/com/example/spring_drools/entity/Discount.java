package com.example.spring_drools.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "discounts")
public class Discount {
    @Id
    private String id;
    private int discount;
}
