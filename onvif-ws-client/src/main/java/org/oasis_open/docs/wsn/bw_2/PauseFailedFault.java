
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.2
 * Generated source version: 4.0.2
 */

@WebFault(name = "PauseFailedFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class PauseFailedFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.PauseFailedFaultType faultInfo;

    public PauseFailedFault() {
        super();
    }

    public PauseFailedFault(String message) {
        super(message);
    }

    public PauseFailedFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public PauseFailedFault(String message, org.oasis_open.docs.wsn.b_2.PauseFailedFaultType pauseFailedFault) {
        super(message);
        this.faultInfo = pauseFailedFault;
    }

    public PauseFailedFault(String message, org.oasis_open.docs.wsn.b_2.PauseFailedFaultType pauseFailedFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = pauseFailedFault;
    }

    public org.oasis_open.docs.wsn.b_2.PauseFailedFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
