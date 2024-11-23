
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.2
 * Generated source version: 4.0.2
 */

@WebFault(name = "UnableToDestroyPullPointFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class UnableToDestroyPullPointFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType faultInfo;

    public UnableToDestroyPullPointFault() {
        super();
    }

    public UnableToDestroyPullPointFault(String message) {
        super(message);
    }

    public UnableToDestroyPullPointFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public UnableToDestroyPullPointFault(String message, org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType unableToDestroyPullPointFault) {
        super(message);
        this.faultInfo = unableToDestroyPullPointFault;
    }

    public UnableToDestroyPullPointFault(String message, org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType unableToDestroyPullPointFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = unableToDestroyPullPointFault;
    }

    public org.oasis_open.docs.wsn.b_2.UnableToDestroyPullPointFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
