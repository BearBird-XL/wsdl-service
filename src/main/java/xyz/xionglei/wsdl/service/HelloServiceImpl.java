package xyz.xionglei.wsdl.service;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String userName, int age) {
        return "Hello, " + userName + "!, 无论如何，都要爱这个世界啊！" + "\t---age " + age;
    }
}
