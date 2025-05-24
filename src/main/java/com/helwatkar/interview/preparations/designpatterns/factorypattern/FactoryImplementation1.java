package com.helwatkar.interview.preparations.designpatterns.factorypattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("factory1")
@Slf4j
public class FactoryImplementation1 implements FactoryInterface {
    @Override
    public void factoryType() {
        log.info("This is Factory Implementation 1.");
    }

    @Override
    public String factoryDescription() {
        return "This is Factory Implementation 1's custom description.";
    }
}
