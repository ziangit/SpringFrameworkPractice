package com.example.springframework;

import org.springframework.stereotype.Component;

@Component
public class AdvancedSpellChecker implements SpellChecker{

    public void checkSpelling(String emailMessage){
        if (emailMessage != null){
            System.out.println("Advanced check spelling...");
            System.out.println("Advanced spell check complete");
        } else {
            throw new RuntimeException("An exception occurred during advanced spell checking");
        }
    }
}
