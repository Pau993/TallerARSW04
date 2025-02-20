package edu.eci.arsw.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GrammarChecker {

    private SpellChecker sc;

    // Inyección mediante setter con @Qualifier para especificar SpanishSpellChecker
    @Autowired
    @Qualifier("spanishSpellChecker")
    public void setSpellChecker(SpellChecker sc) {
        this.sc = sc;
    }

    public String check(String text) {
        StringBuilder sb = new StringBuilder();
        sb.append("Spell checking output:" + sc.checkSpell(text));
        sb.append(" Plagiarism checking output: Not available yet");
        return sb.toString();
    }
}