package xyz.xionglei.wsdl.main;

import xyz.xionglei.wsdl.service.MyService;
import xyz.xionglei.wsdl.service.MyServiceImpl;

import javax.xml.ws.Endpoint;

public class MyPublisher {

    public static void main(String[] args) {
        String url = "http://xionglei.jiuqi.com.cn:9000/myservice";
        MyService service = new MyServiceImpl();
        // 采用EndPoint.publish发布任务
        Endpoint.publish(url, service);
    }
}
