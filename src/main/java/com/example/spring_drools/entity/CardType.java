package com.example.spring_drools.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "cardTypes")
public class CardType {
    @Id
    private String id;
    private String cardType;

}
