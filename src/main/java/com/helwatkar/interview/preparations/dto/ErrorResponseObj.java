package com.helwatkar.interview.preparations.dto;

import lombok.*;

import java.time.Instant;
@Data
public class ErrorResponseObj {
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    private String errorMsg;
    private int errorCode;
    private Instant timestamp;
}
