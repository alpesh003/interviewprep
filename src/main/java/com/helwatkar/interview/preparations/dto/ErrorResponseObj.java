package com.helwatkar.interview.preparations.dto;

import lombok.*;

import java.time.Instant;
@Data
public class ErrorResponseObj {
    private String errorMsg;
    private int errorCode;
    private Instant timestamp;
}
