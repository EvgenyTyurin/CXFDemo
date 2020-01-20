package evgenyt.demo.cfx_demo;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Test client for CXF demo service
 */

public class CXFClient {
    public static void main(String[] args) throws MalformedURLException {
        // Prepare MyService from wsdl
        URL wsdlURL = new URL("http://localhost:8080/services/MyService?wsdl");
        QName SERVICE_NAME = new QName("http://webservice.cfx_demo.demo.evgenyt/", "MyService");
        Service service = Service.create(wsdlURL, SERVICE_NAME);
        MyService client = service.getPort(MyService.class);
        // Run implementation of MyService on server
        System.out.println(client.getData("John Bo"));
    }
}
