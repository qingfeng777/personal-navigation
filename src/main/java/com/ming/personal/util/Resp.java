package com.ming.personal.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Resp {
    private HttpStatus status;
    private String message;
    private Object data;


    public static ResponseEntity Resp(HttpStatus status, String message, Object data){
        return new ResponseEntity(new Resp(status, message, data), status);
    }

    public static ResponseEntity Resp(HttpStatus status, Object data){
        return new ResponseEntity(new Resp(status, data), status);
    }


    public static ResponseEntity Resp(HttpStatus status, String message){
        return new ResponseEntity(new Resp(status, message), status);
    }

    public Resp(HttpStatus status, Object data) {
        this.status = status;
        this.data = data;
    }
    public Resp(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public Resp(HttpStatus status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
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
