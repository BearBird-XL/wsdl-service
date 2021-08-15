package xyz.xionglei.wsdl.main;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import xyz.xionglei.wsdl.service.HelloService;

public class ClientTest {

    public static void main(String[] args) {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:9999/wsdl_service");
        jaxWsProxyFactoryBean.setServiceClass(HelloService.class);
        HelloService helloService = (HelloService) jaxWsProxyFactoryBean.create();
        System.out.println(helloService.sayHello("IU", 29));
    }
}
