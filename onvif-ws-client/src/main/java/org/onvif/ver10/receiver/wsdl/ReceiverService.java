package org.onvif.ver10.receiver.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.1.0
 * Generated source version: 4.1.0
 *
 */
@WebServiceClient(name = "ReceiverService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
public class ReceiverService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://www.onvif.org/ver10/receiver/wsdl", "ReceiverService");
    public static final QName ReceiverPort = new QName("http://www.onvif.org/ver10/receiver/wsdl", "ReceiverPort");
    static {
        WSDL_LOCATION = null;
    }

    public ReceiverService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReceiverService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReceiverService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public ReceiverService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ReceiverService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ReceiverService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns ReceiverPort
     */
    @WebEndpoint(name = "ReceiverPort")
    public ReceiverPort getReceiverPort() {
        return super.getPort(ReceiverPort, ReceiverPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReceiverPort
     */
    @WebEndpoint(name = "ReceiverPort")
    public ReceiverPort getReceiverPort(WebServiceFeature... features) {
        return super.getPort(ReceiverPort, ReceiverPort.class, features);
    }

}
