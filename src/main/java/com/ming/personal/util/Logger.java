package com.ming.personal.util;

public class Logger {
    public static String errLog(String message){
        String log = "[error] " + message;
        System.out.println(log);
        return log;
    }

    public static String infoLog(String message){
        String log = "[info] " + message;
        System.out.println(log);
        return log;
    }
}
