package com.example.spring_drools.config;

import com.example.spring_drools.helper.RuleHelper;
import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DroolsConfig {

    @Autowired
    private RuleHelper ruleHelper;

    private final KieServices kieServices = KieServices.Factory.get();

    private KieFileSystem getFileSystem() {
        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();
        kieFileSystem.write(ResourceFactory.newClassPathResource("offer.drl"));
        return kieFileSystem;
    }

    @Bean
    public KieContainer getKieContainer() {
        System.out.println("Container created ........");
        getKieRepository();
        KieBuilder kb = kieServices.newKieBuilder(getFileSystem());
        kb.buildAll();
        if (kb.getResults().hasMessages(org.kie.api.builder.Message.Level.ERROR)) {
            throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
        }
        KieModule kieModule = kb.getKieModule();
        return kieServices.newKieContainer(kieModule.getReleaseId());
    }

    private void getKieRepository() {
        final KieRepository kieRepository = kieServices.getRepository();
        kieRepository.addKieModule(kieRepository::getDefaultReleaseId);
    }

    @Bean
    public KieSession kieSession() {
        System.out.println("Session Created ......");
        return getKieContainer().newKieSession();
    }
}