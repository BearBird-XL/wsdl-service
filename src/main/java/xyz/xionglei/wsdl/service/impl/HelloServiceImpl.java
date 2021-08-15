package xyz.xionglei.wsdl.service.impl;

import xyz.xionglei.wsdl.service.HelloService;

import javax.jws.WebService;

@WebService
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String userName, int age) {
        return "Hello, " + userName + "!, 无论如何，都要爱这个时间啊！" + "\t---age " + age;
    }
}
