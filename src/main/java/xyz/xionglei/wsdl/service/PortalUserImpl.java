package xyz.xionglei.wsdl.service;

import xyz.xionglei.wsdl.service.PortalUser;

import java.time.LocalDateTime;

public class PortalUserImpl implements PortalUser {
    @Override
    public String bussysVerification(String Portalstep, String UID, String SID, String AID) {
        System.out.println("---------------------------------------");
        System.out.println(LocalDateTime.now());
        System.out.println("PortalUserImpl.bussysVerification");
        System.out.println("UID = " + UID + ", SID = " + SID + ", Portalstep = " + Portalstep + ", AID = " + AID);
        System.out.println("---------------------------------------");
        return AID;
    }
}
