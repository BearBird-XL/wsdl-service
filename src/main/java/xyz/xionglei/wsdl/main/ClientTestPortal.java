package xyz.xionglei.wsdl.main;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import xyz.xionglei.wsdl.service.PortalUser;

public class ClientTestPortal {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:9999/wsdl_service");
        jaxWsProxyFactoryBean.setServiceClass(PortalUser.class);
        PortalUser portalUser = (PortalUser) jaxWsProxyFactoryBean.create();
        System.out.println(portalUser.bussysVerification("UID", "SID", "1", "2"));
    }
}
