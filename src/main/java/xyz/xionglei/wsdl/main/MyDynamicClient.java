package xyz.xionglei.wsdl.main;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

public class MyDynamicClient {

    public static void main(String[] args) {
        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = jaxWsDynamicClientFactory.createClient("http://xionglei.jiuqi.com.cn:9999/wsdl_service?wsdl");
        try {
            QName qName = new QName("http://service.wsdl.xionglei.xyz/", "sayHello");
            Object[] res = client.invoke(qName, "IU", 29);
            System.out.println(res[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
