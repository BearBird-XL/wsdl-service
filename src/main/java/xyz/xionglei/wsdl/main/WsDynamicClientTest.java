package xyz.xionglei.wsdl.main;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;

import javax.xml.namespace.QName;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WsDynamicClientTest {

    private static final String mobileWsdlUrl = "http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl";
    private static final String airLineWsdlUrl = "http://ws.webxml.com.cn/webservices/DomesticAirline.asmx?wsdl";
    private static final String myServiceWsdlUrl = "http://xionglei.jiuqi.com.cn:9000/myservice?wsdl";

    static String wsdlUrl, wsNameSpaceUri, wsLocalPart;

    static {
        wsdlUrl = myServiceWsdlUrl;
        wsNameSpaceUri = "http://xionglei.xyz";
        wsLocalPart = "bussysVerification";
    }

    @Test
    public void test() throws Exception {

        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
        Client client = jaxWsDynamicClientFactory.createClient(wsdlUrl);
        QName qName = new QName(wsNameSpaceUri, wsLocalPart);
        Object[] res = client.invoke(qName, "", "", "", "AID");
//        System.out.println(JSONArray.toJSON(res[0]));

        System.out.println(res[0]);
        System.out.println(res[0].getClass());

//        Field[] declaredFields = res[0].getClass().getDeclaredFields();
//        Method[] declaredMethods = res[0].getClass().getDeclaredMethods();
//        System.out.println("declaredFields: count: " + declaredFields.length + " detail: " + Arrays.toString(declaredFields));
//        System.out.println("declaredMethods: count: " + declaredMethods.length + " detail: " + Arrays.toString(declaredMethods));
//        Object info = declaredMethods[0].invoke(res[0]);
//        if (info.getClass() == ArrayList.class) {
//            List<?> list = (List<?>) info;
//            list.forEach(System.out::println);
//        }
    }
}
