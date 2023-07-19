package com.example.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.example.springframework")
public class AppConfig {

//
//    @Bean(name = "basicSpellChecker")
//    public BasicSpellChecker createBasicSpellChecker(){
//        return new BasicSpellChecker();
//    }
//
//    @Bean(name = "advancedSpellChecker")
//    public AdvancedSpellChecker createAdvancedSpellChecker(){
//        return new AdvancedSpellChecker();
//    }
//
//    @Bean(name = "emailClient")
//    public EmailClient createEmailClient(){
//        EmailClient emailClient = new EmailClient();
//        emailClient.setSpellChecker(createAdvancedSpellChecker());
//        return emailClient;
//    }
}
