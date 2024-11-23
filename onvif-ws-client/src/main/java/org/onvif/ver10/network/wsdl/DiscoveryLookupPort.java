package org.onvif.ver10.network.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.2
 * Generated source version: 4.0.2
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/network/wsdl", name = "DiscoveryLookupPort")
@XmlSeeAlso({org.xmlsoap.schemas.ws._2005._04.discovery.ObjectFactory.class, ObjectFactory.class, org.xmlsoap.schemas.ws._2004._08.addressing.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DiscoveryLookupPort {

    @WebMethod(operationName = "Probe", action = "http://www.onvif.org/ver10/network/wsdl/Probe")
    @WebResult(name = "ProbeResponse", targetNamespace = "http://www.onvif.org/ver10/network/wsdl", partName = "parameters")
    public org.xmlsoap.schemas.ws._2005._04.discovery.ProbeMatchesType probe(

        @WebParam(partName = "parameters", name = "Probe", targetNamespace = "http://www.onvif.org/ver10/network/wsdl")
        org.xmlsoap.schemas.ws._2005._04.discovery.ProbeType parameters
    );
}
