
package org.onvif.ver10.device.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.onvif.ver10.schema.RemoteUser;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RemoteUser" type="{http://www.onvif.org/ver10/schema}RemoteUser" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "remoteUser"
})
@XmlRootElement(name = "GetRemoteUserResponse")
public class GetRemoteUserResponse {

    @XmlElement(name = "RemoteUser")
    protected RemoteUser remoteUser;

    /**
     * Gets the value of the remoteUser property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteUser }
     *     
     */
    public RemoteUser getRemoteUser() {
        return remoteUser;
    }

    /**
     * Sets the value of the remoteUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteUser }
     *     
     */
    public void setRemoteUser(RemoteUser value) {
        this.remoteUser = value;
    }

}
