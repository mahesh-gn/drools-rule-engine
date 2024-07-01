package com.example.spring_drools.helper;

import com.example.spring_drools.entity.CardType;
import com.example.spring_drools.entity.Discount;
import com.example.spring_drools.entity.Name;
import com.example.spring_drools.entity.Price;
import com.example.spring_drools.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RuleHelper {

    @Autowired
    private NameRepository nameRepository;

    @Autowired
    private CardTypeRepository cardTypeRepository;

    @Autowired
    private DiscountRepository discountRepository;

    @Autowired
    private PriceRepository priceRepository;

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void saveName(String name) {
        Name nameEntity = new Name();
        nameEntity.setName(name);
        nameRepository.save(nameEntity);
    }

    public void saveCardType(String cardType) {
        CardType cardTypeEntity = new CardType();
        cardTypeEntity.setCardType(cardType);
        cardTypeRepository.save(cardTypeEntity);
    }

    public void saveDiscount(int discount) {
        Discount discountEntity = new Discount();
        discountEntity.setDiscount(discount);
        discountRepository.save(discountEntity);
    }

    public void savePrice(int price) {
        Price priceEntity = new Price();
        priceEntity.setPrice(price);
        priceRepository.save(priceEntity);
    }
}