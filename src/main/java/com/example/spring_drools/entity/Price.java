package com.example.spring_drools.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "prices")
public class Price {
    @Id
    private String id;
    private int price;
}
