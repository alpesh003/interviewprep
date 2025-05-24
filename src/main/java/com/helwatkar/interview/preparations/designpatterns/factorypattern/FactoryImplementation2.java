package com.helwatkar.interview.preparations.designpatterns.factorypattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("factory2")
@Slf4j
public class FactoryImplementation2 implements FactoryInterface {
    @Override
    public void factoryType() {
        log.info("This is Factory Implementation 2.");
    }

    @Override
    public String factoryDescription() {
        return "This is Factory Implementation 2's custom description.";
    }
}
