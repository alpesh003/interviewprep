package com.helwatkar.interview.preparations.exceptionhandling;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.apache.commons.lang3.math.NumberUtils;

@RestController
@RequestMapping("/api/v1/exceptions")
public class GlobalExceptionHandlingController {

    private static final Logger logger = LogManager.getLogger(GlobalExceptionHandlingController.class);

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Global Exception Handling";
    }

    @GetMapping("/resource")
    public String findResource(@RequestParam(required = false) String resourceId) throws Exception {
        // Simulate a resource not found scenario
        logger.info("Received request to find resource with ID: {}", resourceId);
        if (resourceId == null || resourceId.isEmpty()) { // http://localhost:8080/api/v1/exceptions/resource?resourceId=2
            throw new ResourceNotFoundException("Resource not found with ID: " + resourceId); // Unchecked exception handling
        } else if (resourceId.equals("error")) {http://localhost:8080/api/v1/exceptions/resource?resourceId=error
            throw new Exception("Simulated runtime exception"); // Checked exception handling
        } else if (!NumberUtils.isCreatable(resourceId)) {http://localhost:8080/api/v1/exceptions/resource?resourceId=abc
            throw new ResourceNotANumberException("Resource ID must be a number: " + resourceId); // Checked exception handling
        }
        return "Resource found with ID: " + resourceId;
    }

}
