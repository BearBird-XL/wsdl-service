package xyz.xionglei.wsdl.service;

import javax.jws.WebService;

@WebService
public interface HelloService {

    public String sayHello(String userName, int age);
}
