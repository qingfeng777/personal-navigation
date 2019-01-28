package com.ming.personal.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Resp {
    private int status;
    private String message;
    private Object data;

    public static ResponseEntity Resp(HttpStatus status, String message, Object data){
        return new ResponseEntity(new Resp(status.value(), message, data), status);
    }

    public static ResponseEntity Resp(HttpStatus status, Object data){
        return new ResponseEntity(new Resp(status.value(), data), status);
    }

    public static ResponseEntity Resp(HttpStatus status, String message){
        return new ResponseEntity(new Resp(status.value(), message), status);
    }

    public Resp(int status, Object data) {
        this.status = status;
        this.data = data;
    }
    public Resp(int status, String message) {
        this.status = status;
        this.message = message;
    }

    public Resp(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
