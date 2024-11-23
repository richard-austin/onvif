package org.onvif.ver10.network.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.2
 * Generated source version: 4.0.2
 *
 */
@WebServiceClient(name = "DiscoveryService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver10/network/wsdl")
public class DiscoveryService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.onvif.org/ver10/network/wsdl", "DiscoveryService");
    public final static QName RemoteDiscoveryPort = new QName("http://www.onvif.org/ver10/network/wsdl", "RemoteDiscoveryPort");
    public final static QName DiscoveryLookupPort = new QName("http://www.onvif.org/ver10/network/wsdl", "DiscoveryLookupPort");
    static {
        WSDL_LOCATION = null;
    }

    public DiscoveryService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DiscoveryService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DiscoveryService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public DiscoveryService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DiscoveryService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DiscoveryService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns RemoteDiscoveryPort
     */
    @WebEndpoint(name = "RemoteDiscoveryPort")
    public RemoteDiscoveryPort getRemoteDiscoveryPort() {
        return super.getPort(RemoteDiscoveryPort, RemoteDiscoveryPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RemoteDiscoveryPort
     */
    @WebEndpoint(name = "RemoteDiscoveryPort")
    public RemoteDiscoveryPort getRemoteDiscoveryPort(WebServiceFeature... features) {
        return super.getPort(RemoteDiscoveryPort, RemoteDiscoveryPort.class, features);
    }


    /**
     *
     * @return
     *     returns DiscoveryLookupPort
     */
    @WebEndpoint(name = "DiscoveryLookupPort")
    public DiscoveryLookupPort getDiscoveryLookupPort() {
        return super.getPort(DiscoveryLookupPort, DiscoveryLookupPort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DiscoveryLookupPort
     */
    @WebEndpoint(name = "DiscoveryLookupPort")
    public DiscoveryLookupPort getDiscoveryLookupPort(WebServiceFeature... features) {
        return super.getPort(DiscoveryLookupPort, DiscoveryLookupPort.class, features);
    }

}
