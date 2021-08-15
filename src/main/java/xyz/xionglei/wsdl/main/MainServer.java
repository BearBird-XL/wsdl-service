package xyz.xionglei.wsdl.main;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import xyz.xionglei.wsdl.service.impl.HelloServiceImpl;

public class MainServer {

    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setAddress("http://localhost:9999/wsdl_service");
        jaxWsServerFactoryBean.setServiceClass(HelloServiceImpl.class);

        Server server = jaxWsServerFactoryBean.create();
        server.start();
    }
}
