package com.helwatkar.interview.preparations.designpatterns.factorypattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class FactoryPattern {
    @Autowired
    private Map<String, FactoryInterface> factoryInterfaceMap;

    public FactoryInterface getFactoryImplementation(String factoryType) {
        return factoryInterfaceMap.get(factoryType);
    }

    public Map<String, FactoryInterface> getFactoryImplementations() {
        return factoryInterfaceMap;
    }

}
