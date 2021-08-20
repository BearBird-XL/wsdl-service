package xyz.xionglei.wsdl.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "MyServicePort", // 定义port名称
        serviceName = "MyService",
        targetNamespace = "http://xionglei.xyz")
public interface MyService {
    @WebMethod(operationName = "bussysVerification")
    String bussysVerification(String Portalstep, String UID, String SID, String AID);
}
