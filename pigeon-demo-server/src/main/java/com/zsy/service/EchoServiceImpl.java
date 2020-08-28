package com.zsy.service;

import com.zsy.api.EchoService;

public class EchoServiceImpl implements EchoService {

    private String hello = "Hello world!";

    @Override
    public String echo(String name) {
        System.out.println(hello);
        return hello;
    }

}
