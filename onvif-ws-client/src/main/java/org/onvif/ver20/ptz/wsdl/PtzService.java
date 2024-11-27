package org.onvif.ver20.ptz.wsdl;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0
 * Generated source version: 4.0.0
 *
 */
@WebServiceClient(name = "PtzService",
                  wsdlLocation = "null",
                  targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
public class PtzService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.onvif.org/ver20/ptz/wsdl", "PtzService");
    public final static QName PtzPort = new QName("http://www.onvif.org/ver20/ptz/wsdl", "PtzPort");
    static {
        WSDL_LOCATION = null;
    }

    public PtzService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public PtzService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PtzService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public PtzService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public PtzService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public PtzService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns PTZ
     */
    @WebEndpoint(name = "PtzPort")
    public PTZ getPtzPort() {
        return super.getPort(PtzPort, PTZ.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PTZ
     */
    @WebEndpoint(name = "PtzPort")
    public PTZ getPtzPort(WebServiceFeature... features) {
        return super.getPort(PtzPort, PTZ.class, features);
    }

}
