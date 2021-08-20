package xyz.xionglei.wsdl.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface HelloService {

    @WebMethod
    @WebResult(name = "sayHelloRetValue")
    String sayHello(@WebParam(name = "username") String userName, @WebParam(name = "age") int age);
}
