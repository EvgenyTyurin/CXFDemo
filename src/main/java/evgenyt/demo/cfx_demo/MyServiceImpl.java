package evgenyt.demo.cfx_demo;

import javax.jws.WebService;
import javax.xml.ws.soap.MTOM;

/**
 * Service implementation
 */

@MTOM
@WebService(endpointInterface = "evgenyt.demo.cfx_demo.MyService")
public class MyServiceImpl implements MyService {
    public String getData(String name) {
        return "Hello World for " + name;
    }
}
