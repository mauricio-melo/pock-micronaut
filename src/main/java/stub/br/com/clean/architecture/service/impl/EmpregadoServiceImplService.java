
package stub.br.com.clean.architecture.service.impl;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmpregadoServiceImplService", targetNamespace = "http://impl.service.architecture.clean.com.br/", wsdlLocation = "META-INF/service_example.wsdl")
public class EmpregadoServiceImplService
    extends Service
{

    private final static URL EMPREGADOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPREGADOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EMPREGADOSERVICEIMPLSERVICE_QNAME = new QName("http://impl.service.architecture.clean.com.br/", "EmpregadoServiceImplService");

    static {
        EMPREGADOSERVICEIMPLSERVICE_WSDL_LOCATION = stub.br.com.clean.architecture.service.impl.EmpregadoServiceImplService.class.getClassLoader().getResource("META-INF/service_example.wsdl");
        WebServiceException e = null;
        if (EMPREGADOSERVICEIMPLSERVICE_WSDL_LOCATION == null) {
            e = new WebServiceException("Cannot find 'META-INF/service_example.wsdl' wsdl. Place the resource correctly in the classpath.");
        }
        EMPREGADOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public EmpregadoServiceImplService() {
        super(__getWsdlLocation(), EMPREGADOSERVICEIMPLSERVICE_QNAME);
    }

    public EmpregadoServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPREGADOSERVICEIMPLSERVICE_QNAME, features);
    }

    public EmpregadoServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EMPREGADOSERVICEIMPLSERVICE_QNAME);
    }

    public EmpregadoServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPREGADOSERVICEIMPLSERVICE_QNAME, features);
    }

    public EmpregadoServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpregadoServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmpregadoService
     */
    @WebEndpoint(name = "empregadoservicePort")
    public EmpregadoService getEmpregadoservicePort() {
        return super.getPort(new QName("http://impl.service.architecture.clean.com.br/", "empregadoservicePort"), EmpregadoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpregadoService
     */
    @WebEndpoint(name = "empregadoservicePort")
    public EmpregadoService getEmpregadoservicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://impl.service.architecture.clean.com.br/", "empregadoservicePort"), EmpregadoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPREGADOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EMPREGADOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return EMPREGADOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
