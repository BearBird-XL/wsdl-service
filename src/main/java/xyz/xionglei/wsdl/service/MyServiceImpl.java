package xyz.xionglei.wsdl.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.time.LocalDateTime;

@WebService(name = "MyServicePort", // 定义port名称
        serviceName = "MyService",
        targetNamespace = "http://xionglei.xyz")
public class MyServiceImpl implements MyService {
    @WebMethod(operationName = "bussysVerification")
    @Override
    public String bussysVerification(String Portalstep, String UID, String SID, String AID) {
        System.out.println("start" + LocalDateTime.now() + "--" + System.nanoTime() + "---------------");
        System.out.println("MyServiceImpl.bussysVerification");
        System.out.println("Portalstep = " + Portalstep + ", UID = " + UID + ", SID = " + SID + ", AID = " + AID);
        System.out.println("end" + LocalDateTime.now() + "--" + System.nanoTime() + "-----------------");
        return AID;
    }
}
