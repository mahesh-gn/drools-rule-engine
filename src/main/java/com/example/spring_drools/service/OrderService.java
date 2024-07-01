package com.example.spring_drools.service;

import com.example.spring_drools.entity.Orders;
import com.example.spring_drools.helper.RuleHelper;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KieContainer kieContainer;

    @Autowired
    private RuleHelper ruleHelper;

    public void processOrder(Orders order) {
        KieSession kieSession = kieContainer.newKieSession();
        kieSession.setGlobal("ruleHelper", ruleHelper);
        kieSession.insert(order);
        kieSession.fireAllRules();
        kieSession.dispose();
    }
}