
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.5
 * Generated source version: 4.0.5
 */

@WebFault(name = "TopicExpressionDialectUnknownFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class TopicExpressionDialectUnknownFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType faultInfo;

    public TopicExpressionDialectUnknownFault() {
        super();
    }

    public TopicExpressionDialectUnknownFault(String message) {
        super(message);
    }

    public TopicExpressionDialectUnknownFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public TopicExpressionDialectUnknownFault(String message, org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType topicExpressionDialectUnknownFault) {
        super(message);
        this.faultInfo = topicExpressionDialectUnknownFault;
    }

    public TopicExpressionDialectUnknownFault(String message, org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType topicExpressionDialectUnknownFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = topicExpressionDialectUnknownFault;
    }

    public org.oasis_open.docs.wsn.b_2.TopicExpressionDialectUnknownFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
