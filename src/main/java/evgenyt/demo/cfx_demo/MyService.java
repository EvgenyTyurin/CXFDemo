package evgenyt.demo.cfx_demo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * Service interface
 */

@WebService(targetNamespace = "http://webservice.cfx_demo.demo.evgenyt/", name = "myWebService")
@SOAPBinding(style = Style.RPC)
public interface MyService {
    @WebMethod(action = "http://webservice.cfx_demo.demo.evgenyt/")
    public String getData(String path);
}
