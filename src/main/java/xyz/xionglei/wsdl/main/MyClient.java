package xyz.xionglei.wsdl.main;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

public class MyClient {

    public static void main(String[] args) {
        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = jaxWsDynamicClientFactory.createClient("http://xionglei.jiuqi.com.cn:9000/myservice?wsdl");
        QName qName = new QName("http://xionglei.xyz", "bussysVerification");
        try {
            Object[] results = client.invoke(qName, "PortalstepValue", "UIDValue", "SIDValue", "AIDValue");
            System.out.println("success: resValue = " + results[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
