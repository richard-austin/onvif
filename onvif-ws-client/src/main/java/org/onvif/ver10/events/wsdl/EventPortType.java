package org.onvif.ver10.events.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.1.0
 * Generated source version: 4.1.0
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver10/events/wsdl", name = "EventPortType")
@XmlSeeAlso({org.oasis_open.docs.wsrf.r_2.ObjectFactory.class, ObjectFactory.class, org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class})
public interface EventPortType {

    /**
     * The WS-BaseNotification specification defines a set of OPTIONAL
     *         WS-ResouceProperties.
     *         This specification does not require the implementation of the WS-ResourceProperty interface.
     *         Instead, the subsequent direct interface shall be implemented by an ONVIF compliant device
     *         in order to provide information about the FilterDialects, Schema files and topics supported
     *         by
     *         the device.
     *       
     */
    @WebMethod(operationName = "GetEventProperties", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetEventPropertiesRequest")
    @Action(input = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetEventPropertiesRequest", output = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetEventPropertiesResponse")
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "GetEventPropertiesResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", partName = "parameters")
    public GetEventPropertiesResponse getEventProperties(

        @WebParam(partName = "parameters", name = "GetEventProperties", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
        GetEventProperties parameters
    );

    /**
     * This method returns a PullPointSubscription that can be polled using
     *         PullMessages.
     *         This message contains the same elements as the SubscriptionRequest of the
     *         WS-BaseNotification without the ConsumerReference.
     *         
     *         If no Filter is specified the pullpoint notifies all occurring events to the tests.
     *         
     *         This method is mandatory.
     *       
     */
    @WebMethod(operationName = "CreatePullPointSubscription", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/CreatePullPointSubscriptionRequest")
    @Action(input = "http://www.onvif.org/ver10/events/wsdl/EventPortType/CreatePullPointSubscriptionRequest", output = "http://www.onvif.org/ver10/events/wsdl/EventPortType/CreatePullPointSubscriptionResponse", fault = {})
    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @WebResult(name = "CreatePullPointSubscriptionResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", partName = "parameters")
    public CreatePullPointSubscriptionResponse createPullPointSubscription(

        @WebParam(partName = "parameters", name = "CreatePullPointSubscription", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
        CreatePullPointSubscription parameters
    ) throws org.oasis_open.docs.wsn.bw_2.TopicNotSupportedFault, org.oasis_open.docs.wsn.bw_2.TopicExpressionDialectUnknownFault, org.oasis_open.docs.wsn.bw_2.InvalidTopicExpressionFault, org.oasis_open.docs.wsn.bw_2.InvalidMessageContentExpressionFault, org.oasis_open.docs.wsn.bw_2.InvalidProducerPropertiesExpressionFault, org.oasis_open.docs.wsn.bw_2.UnacceptableInitialTerminationTimeFault, org.oasis_open.docs.wsn.bw_2.NotifyMessageNotSupportedFault, org.oasis_open.docs.wsrf.rw_2.ResourceUnknownFault, org.oasis_open.docs.wsn.bw_2.UnsupportedPolicyRequestFault, org.oasis_open.docs.wsn.bw_2.InvalidFilterFault, org.oasis_open.docs.wsn.bw_2.SubscribeCreationFailedFault, org.oasis_open.docs.wsn.bw_2.UnrecognizedPolicyRequestFault;

    /**
     * Returns the capabilities of the event service. The result is returned in a
     *         typed answer.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetServiceCapabilitiesRequest")
    @Action(input = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetServiceCapabilitiesRequest", output = "http://www.onvif.org/ver10/events/wsdl/EventPortType/GetServiceCapabilitiesResponse")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/events/wsdl", className = "org.onvif.ver10.events.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/events/wsdl")
    public org.onvif.ver10.events.wsdl.Capabilities getServiceCapabilities()
;
}
