package edu.cqupt.serviceImpl;

import edu.cqupt.service.HelloService;

public class HelloServiceImpl implements HelloService {
    public void sayHello(String name) {
        System.out.println("hello" + name);

    }
}
