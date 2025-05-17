package com.helwatkar.interview.preparations.java.fundamentals.genericsjava;

import com.helwatkar.interview.preparations.exceptionhandling.ResourceNotANumberException;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/generics")
public class GenericsController {
    @GetMapping("/getGenericsElements")
    public String getGenericsElement() {
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setItem("String1");
        GenericBox<Integer> integerGenericBox = new GenericBox<>();
        integerGenericBox.setItem(10);
        return "Elements in the generic box are: " + stringBox.getItem() + " and " + integerGenericBox.getItem();
    }

    @GetMapping("/addValues")//http://localhost:8080/api/v1/generics/addValues?val1=100&val2=200
    public String returnSum(@RequestParam("val1") int val1, @RequestParam("val2") int val2) {
        GenericCalculator<Integer> genericCalculator = new GenericCalculator<>(val1, val2);
        return "Sum of the values is: " + genericCalculator.add();
    }

    @GetMapping("/subtractValues")
    public String returnDiff(@RequestParam("val1") int val1, @RequestParam("val2") int val2) {
        GenericCalculator<Integer> genericCalculator = new GenericCalculator<>(val1, val2);
        return "Difference of the values is: " + genericCalculator.subtract();
    }

    @GetMapping("/multiplyValues")
    public String multiplyVal(@RequestParam("val1") Double val1, @RequestParam("val2") Double val2) {
        GenericCalculator<Double> genericCalculator = new GenericCalculator<>(val1, val2);
        genericCalculator.multiply();
        return "Multiplication result of the values is: " + genericCalculator.multiply();
    }
}
