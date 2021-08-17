package xyz.xionglei.wsdl.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface PortalUser {

    @WebMethod
    @WebResult(name = "bussysVerificationResponse")
    String bussysVerification(@WebParam(name = "UID") String UID,
                              @WebParam(name = "SID") String SID,
                              @WebParam(name = "portalstep") String portalstep,
                              @WebParam(name = "AID") String AID);
}
