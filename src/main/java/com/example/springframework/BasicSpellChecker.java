package com.example.springframework;

import org.springframework.stereotype.Component;

@Component
public class BasicSpellChecker implements SpellChecker {

    public void checkSpelling(String emailMessage){
        if (emailMessage != null){
            System.out.println("basic check spelling...");
            System.out.println("basic spell check complete");
        } else {
            throw new RuntimeException("An exception occurred while checking basic spelling");
        }
    }
}
