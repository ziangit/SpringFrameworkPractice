package com.example.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class EmailApplication {
    public static void main(String[] args){

//        ApplicationContext applicationContext =
//                new ClassPathXmlApplicationContext("beans.xml");

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        EmailClient emailClient = applicationContext.getBean("emailClient", EmailClient.class);
//        EmailClient emailClient = new EmailClient(new AdvancedSpellChecker());
        emailClient.sendEmail("First email");
        emailClient.sendEmail("Second email");
        //test

    }
}
